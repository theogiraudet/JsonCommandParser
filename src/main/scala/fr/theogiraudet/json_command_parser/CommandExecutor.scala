package fr.theogiraudet.json_command_parser

import java.util.Optional

import fr.theogiraudet.json_command_parser.core.exception._

import scala.jdk.CollectionConverters._
import scala.annotation.varargs

object CommandExecutor {

  /**
    * Cherche à exécuter <i>string</i> comme une commande.
    * @param string une chaîne de caractère
    * @return
    */
  @varargs
  def execute(string: String, parameters: AnyRef*): Optional[ExecutionResult] = {
    val command = string.takeWhile(_ != ' ')
    val result = Command.commands.get(command).map(_.execute(string)).getOrElse(Failure("", BadCommand, null))
     result match {
      case Failure(_, _, _) => Optional.of(result)
      case Success(args, method) => {
        val array = (parameters ++ args.asScala).toArray
        try {
          method.invoke(Command.commands.get(command).get, array: _*);
          Optional.empty()
        } catch {
          case _: IllegalArgumentException => throw new ParseException(_ =>
            s"""The parameters passed to function '${Command.commands.get(command).get.getClass.getSimpleName}#${method.getName}' are incorrect.
               Found: [${array.map(_.getClass.getSimpleName).mkString(", ")}]
               Require: [${method.getParameterTypes.map(_.getSimpleName.capitalize).mkString(", ")}]""")
        }
      }
    }
  }

  /**
    * @param text une chaîne de caractères
    * @return la sous-chaîne correspondant à la commande si <i>text</i> était préfixé par le préfixe de commande, None sinon.
    */
  def isCommand(text: String): Option[String] = {
    if(text.startsWith(Configuration.getPrefix))
      Some(text.substring(Configuration.getPrefix.size))
    else
      None
  }

}
