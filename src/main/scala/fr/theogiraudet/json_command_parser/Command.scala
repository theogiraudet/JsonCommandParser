package fr.theogiraudet.json_command_parser

import java.io.InputStream

import fr.theogiraudet.json_command_parser.core.command_argument.Argument

import scala.collection.mutable

abstract class Command {

  var name: String = _
  private[json_command_parser] var description: String = _
  private[json_command_parser] var aliases: Set[String] = _
  private[json_command_parser] var permissions: Set[String] = _
  private[json_command_parser] var syntax: Argument = _

  def execute(string: String) = syntax.run(string)

  final def getSyntaxFile: InputStream = getClass.getClassLoader.getResourceAsStream(Configuration.getCommandSyntaxRoot + defineSyntaxFile)

  /**
    * @return le chemin d'accès vers le fichier de syntaxe en partant du dossier ressource du programme
    */
  protected def defineSyntaxFile: String

  private[json_command_parser] def register = Command.commands += (name -> this)

}

object Command {

  private[json_command_parser] val commands: mutable.Map[String, Command] = mutable.Map()

}
