package fr.theogiraudet.json_command_parser

import java.lang.reflect.Method
import java.util.Optional

import fr.theogiraudet.json_command_parser.core.exception._

import scala.annotation.varargs
import scala.collection.mutable
import scala.jdk.CollectionConverters._

object CommandExecutor {

  val listResult = mutable.ListBuffer[AnyRef]()
  private var isPiped: Option[java.lang.Boolean] = None

  /**
    * Cherche à exécuter <i>string</i> comme une commande.
    * @param string une chaîne de caractère
    * @return
    */
  @varargs
  def execute(string: String, parameters: AnyRef*): Optional[ExecutionResult] = {
    listResult.clear
    isPiped = Some(false)
    val result = executeCommand(string, parameters.toList)
    isPiped = None
    result
  }

  private def executeCommand(string: String, parameters: List[AnyRef]): Optional[ExecutionResult] = {
    val command = string.takeWhile(_ != ' ')
    val result = Command.commands.get(command).map(_.execute(string)).getOrElse(Failure(command, BadCommand, null))

    def executeMethod(args: java.util.List[AnyRef], method: Method, andReturn: AnyRef => Optional[ExecutionResult]): Optional[ExecutionResult] = {
      val array = (parameters ++ args.asScala).toArray
      try {
        val result = method.invoke(Command.commands(command), array: _*)
        andReturn(result)
      } catch {
        case _: IllegalArgumentException => throw new ParseException(_ =>
          s"""The parameters passed to function '${Command.commands(command).getClass.getSimpleName}#${method.getName}' are incorrect.
               Found: [${array.map(_.getClass.getSimpleName).mkString(", ")}]
               Require: [${method.getParameterTypes.map(_.getSimpleName.capitalize).mkString(", ")}]""")
      }
    }

    result match {
      case Failure(_, _, _) => Optional.of(result)
      case Success(args, method) => {
        isPiped = Some(false)
        executeMethod(args, method, _ => Optional.empty())
      }
      case SuccessPipe(args, method, queue) => {
        isPiped = Some(true)
        def createPipeline(result: AnyRef) = {
          listResult += result
          executeCommand(queue.substring(1).trim, parameters)
        }

        executeMethod(args, method, createPipeline)
      }
    }
  }

  /**
    * @param text une chaîne de caractères
    * @return la sous-chaîne correspondant à la commande si <i>text</i> était préfixé par le préfixe de commande, None sinon.
    */
  def isCommand(text: String): Option[String] = {
    if(text.startsWith(Configuration.getPrefix))
      Some(text.substring(Configuration.getPrefix.length))
    else
      None
  }

  /**
    * @return None si aucune commande est en cours d'exécution, Some(false) si une commande est en cours d'exécution, Some(true) si celle-ci est pipé
    */
  def isPipedCommands: Option[java.lang.Boolean] = isPiped

}
