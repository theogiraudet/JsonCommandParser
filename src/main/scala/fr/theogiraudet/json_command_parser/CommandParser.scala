package fr.theogiraudet.json_command_parser

import java.io.FileNotFoundException

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, RecognitionException}

import scala.reflect.runtime.{currentMirror, universe}
import fr.theogiraudet.json_command_parser.Configuration._
import fr.theogiraudet.json_command_parser.core.{Actions, JsonCommandSyntaxLexer, JsonCommandSyntaxParser}
import org.reflections.Reflections

object CommandParser {


  /**
    * Parse la syntaxe d'une commande et initialise <i>command<i>.<br/>
    * Si la classe est annotée par <i>Ignore</i>, ne fait rien.
    * @param command une instance de <i>Command</i> dont la syntaxe doit être parsé
    */
  def parseCommand(command: Command): Unit = {
    val clazz = command.getClass
    val symbol = universe.runtimeMirror(clazz.getClassLoader).classSymbol(clazz)
    if(!symbol.annotations.exists(_.tree.tpe =:= universe.typeOf[Ignore])) {
      Actions.command = command
      var lexer: JsonCommandSyntaxLexer = null
      try {
        val input = CharStreams.fromStream(command.getSyntaxFile)
        lexer = new JsonCommandSyntaxLexer(input)
        val tokenStream = new CommonTokenStream(lexer)
        val parser = new JsonCommandSyntaxParser(tokenStream)
        parser.root
        if(getDebug) println(s"${command.getClass.getSimpleName} -> Loaded")
      } catch {
        case fnc: FileNotFoundException => System.err.println(fnc)
        case re: RecognitionException => System.err.println(re)
      }
    } else
        if(getDebug) println(s"${command.getClass.getSimpleName} -> Ignored")
  }

  /**
    * Appelle la fonction {@link fr.theogiraudet.json_command_parser.CommandParser#parseCommand parseCommand} sur toutes les classes du packag pointé par <i>packag</i> si celles-ci héritent de {@link fr.theogiraudet.json_command_parser.Command Command}.
    * @param packag un package
    */
  def parseCommands(packag: String): Unit = {
    val reflections: Reflections = new Reflections(packag)
    reflections.getSubTypesOf(classOf[Command]).forEach((c: Class[_ <: Command]) => parseCommand(c.newInstance))
  }

}
