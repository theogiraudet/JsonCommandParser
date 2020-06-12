package fr.theogiraudet.json_command_parser.core

import fr.theogiraudet.json_command_parser.Command
import fr.theogiraudet.json_command_parser.core.command_argument._
import fr.theogiraudet.json_command_parser.core.exception.ParseException

import scala.collection.mutable
import scala.util.Try

object Actions {

  var command: Command = _
  var list: List[String] = _
  val idMap = mutable.Map[String, Argument]()
  val referenceSet = mutable.Set[(ReferenceArgument, String, Int)]()

  def initCommand: Unit = {
    command.name = UtilLex.string
    idMap.clear
    referenceSet.clear
  }

  def resultCommand: Unit = {
    command.syntax = new RootArgument().initializeWith(command.syntax)
    command.syntax.defineMatches(command.name)
    resolveReference
    command.register
  }

  def setDescription: Unit = {
    ParserStack.addElement("description")
    command.description = UtilLex.string
  }

  def setAliases: Unit = {
    ParserStack.addElement("aliases")
    command.aliases = list.toSet
  }

  def setPermissions: Unit = {
    ParserStack.addElement("permissions")
    command.permissions = list.toSet
  }

  def setMatches: Unit = {
    ParserStack.addElement("matches")
    ParserStack.getArgument.defineMatches(UtilLex.string)
  }

  def stackArguments: Unit = ParserStack.addElement("arguments")

  def setType: Unit = ParserStack.setArgument(getType(UtilLex.string).initializeWith(ParserStack.getArgument))

  def setId: Unit = {
    ParserStack.addElement("id")
    idMap += (UtilLex.string -> ParserStack.getArgument)
    ParserStack.getArgument.id = UtilLex.string
  }

  def setExecute: Unit = {
    ParserStack.addElement("execute")
    val method = command.getClass.getMethods.find(_.getName == UtilLex.string)
    if(method.isDefined)
      ParserStack.getArgument.execute = method.get
    else
      throw new ParseException(line => s"'${UtilLex.string}' is not a method of '${command.getClass.getName}'.\nAt line $line")
  }

  def setTag: Unit = {
    ParserStack.getArgument.tag = UtilLex.string
    ParserStack.addElement("tag")
  }

  def setKeepValue: Unit = {
    ParserStack.getArgument.keepValue = UtilLex.bool
    ParserStack.addElement("keep_value")
  }

  /**
    * @param typeLitteral un type littéral
    * @return une instance de l'argument du type correspondant à <i>typeLitteral</i>. Déclenche une erreur si aucun argument ne corresponds.
    */
  private def getType(typeLitteral: String): Argument = {
    typeLitteral match {
      case "string" => new StringArgument
      case "integer" => new IntArgument
      case "float" => new FloatArgument
      case "boolean" => new BooleanArgument
      case "reference" => new ReferenceArgument
      case _ => getComplexType(typeLitteral)
    }
  }

  /**
    * @param typeLitteral un type littéral
    * @return une instance de l'argument complexe du type correspondant à <i>typeLitteral</i>. Déclenche une erreur si aucun argument ne corresponds.
    */
  private def getComplexType(typeLitteral: String): Argument = {
    val listPattern = "(?<=list<).*(?=>)".r
    val varargsPattern = ".*(?=\\.\\.\\.)".r

    val result = listPattern.findFirstIn(typeLitteral)
    if(result.isDefined)
      new ListArgument(getType(result.get))
    else {
      val result2 = varargsPattern.findFirstIn(typeLitteral)
      if(result2.isDefined)
        new VaragsArgument(getType(result2.get))
      else
        throw new ParseException(line => s"'$typeLitteral' is not a valid type.\nAt line $line")
    }
  }


  /**
    * Initialise un nouveau contexte local en la ligne de début du contexte courant et en ajoutant pour vérifier les clés présentes.
    */
  def newContext: Unit = {
    if(ParserStack.isEmpty) {
      ParserStack.newContext(UtilLex.lineNumber)
      ParserStack.addRequires(("root"), Set("description", "permissions"))
    } else {
      ParserStack.newContext(UtilLex.lineNumber)
      ParserStack.addRequires(("local context"), Set("type", "tag"))
    }
  }

  /**
    * Vérifie les incompatibilités, supprime le contexte courant et défini l'argument retourné par celui-ci comme fils de l'argument du nouveau contexte courant.
    */
  def deleteContext: Unit = {
    if(!ParserStack.contains("arguments") && !ParserStack.contains("execute"))
      throw new ParseException(_ => "'execute' is requires if 'arguments' not exists in local context.\nIn context at line " + ParserStack.getLine)
    checkCompatibility
    checkRequires
    val argument = ParserStack.deleteContext
    if(!ParserStack.isEmpty)
      ParserStack.getArgument.children += argument
    else
      command.syntax = argument
  }

  /**
    * Vérifie les incompatibilités au niveau 0 (de la racine). //TODO
    * Supprime le context local.
    */
  private def checkCompatibility = {
    val incompatibilities = ParserStack.foundIncompatibility
    if(incompatibilities.size > 0) {
      val trace = incompatibilities.map(pair => s"'${pair._1}' is not compatible with key(s) : " + pair._2.map(s => s"'$s'").mkString(", ")).mkString("\n") + ".\n"
      throw new ParseException(line => trace + "In local context at line " + line, ParserStack.getLine)
    }
  }

  /**
    * Vérifie les incompatibilités au niveau 0 (de la racine). //TODO
    * Supprime le context local.
    */
  private def checkRequires = {
    val requires = ParserStack.checkRequires
    if(requires.size > 0) {
      val trace = requires.map(pair => s"'${pair._1}' is requires this key(s) in the same context : " + pair._2.map(s => s"'$s'").mkString(", ")).mkString("\n") + ".\n"
      throw new ParseException(line => trace + "In local context at line " + line, ParserStack.getLine)
    }
  }

  private def resolveReference = {
    referenceSet.foreach(elem => resolveArgument(elem))
  }

  private def resolveArgument(info: (ReferenceArgument, String, Int)) = {
    val link = idMap.get(info._2).map(arg => info._1.refereTo = arg)
    if(link.isEmpty)
      throw new ParseException(_ => s"ID '${info._2}' is not defined.\nIn local context at line ${info._3}")
  }

  def initList: Unit = list = List[String]()
  def addToList: Unit = list = list :+ UtilLex.string


}
