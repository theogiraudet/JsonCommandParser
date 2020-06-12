package fr.theogiraudet.json_command_parser.core.command_argument

import java.util.regex.PatternSyntaxException

import fr.theogiraudet.json_command_parser.core.exception.ParseException

class StringArgument extends Argument {

  override protected[json_command_parser] val ID: String = "string"

  private val regexQuotedString = """"(?:[^"\\]|\\.)*"""".r
  private var regex = ".*".r

  /**
    * @param input la chaîne de caractères à traiter
    * @return un triplet tel que le premier élément et la réussite du parse, le deuxième et la valeur parsée et la troisième est le reste de la chaîne à faire traiter.
    */
  override protected[command_argument] def parse(input: String): (Option[AnyRef], String) = {
      if(input.startsWith("\"")) {
        val result = regexQuotedString.findFirstIn(input)
        if(result.isDefined) {
          val result2 = result.get.drop(1).dropRight(1)
          if(checkString(result2))
            return (Some(result2), input.substring(result.get.length))
        }

      } else {
        val result = readWord(input)
        if(checkString(result._1))
          return (Some(result._1), result._2)
      }
    (None, input)
  }

  /**
    * @param string un String
    * @return si <i>string</i> correponds au pattern <regex>
    */
  private def checkString(string: String): Boolean = regex.matches(string)

  /**
    * Défini les restrictions sur le paramètre lu par l'exécuteur de commande
    * @param string la restriction
    */
  override def defineMatches(string: String): Unit = {
    try {
      regex = string.r
    } catch {
      case _: PatternSyntaxException => throw new ParseException(line => s"'$string' is not a valid Regex pattern.\nAt line $line")
    }
  }

  /**
    * @return un message d'échec de parse
    */
  override protected def getFailureMessage: String = s"'$tag': expected string " + matchingToString

  /**
    * @return la conversion du matching en String
    */
  override protected[json_command_parser] def matchingToString: String = "matching '$regex'"
}
