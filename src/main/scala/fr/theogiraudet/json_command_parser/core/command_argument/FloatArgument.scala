package fr.theogiraudet.json_command_parser.core.command_argument

import fr.theogiraudet.json_command_parser.core.exception.ParseException

class FloatArgument extends Argument {

  override protected[json_command_parser] val ID: String = "float"

  private var min: Float = Float.MinValue
  private var max: Float = Float.MaxValue

  /**
    * @param input la chaîne de caractères à traiter
    * @return un triplet tel que le premier élément et la réussite du parse, le deuxième et la valeur parsée et la troisième est le reste de la chaîne à faire traiter.
    */
  override protected[command_argument] def parse(input: String): (Option[AnyRef], String) = {
    val (word, queue) = readWord(input)
    (word.toFloatOption.filter(int => int >= min && int <= max).map(_.asInstanceOf[AnyRef]), queue)
  }

  /**
    * Défini les restrictions sur le paramètre lu par l'exécuteur de commande
    * @param string la restriction
    */
  override def defineMatches(string: String): Unit = {
    parseInterval(string)
    if(min > max)
      throw new ParseException(line => s"The minimum in '$string' can't me greater than the maximum.\nAt line $line")
  }

  /**
    * Parse le string passé en paramètre en deux valeurs min et max. Si le parse n'est pas possible renvoie une erreur.
    * @param string un string
    */
  private def parseInterval(string: String): Unit = {
    try {
      if (string.startsWith(".."))
        max = string.drop(2).toFloat
      else if(string.endsWith(".."))
        min = string.dropRight(2).toFloat
      else {
        val interval = string.split("\\.\\.")
        if(interval.length == 2) {
          min = interval.head.toFloat
          max = interval.last.toFloat
        } else throw new ParseException(line => s"'$string' is not a valid float interval.\n At line $line")
      }
    } catch {
      case _: NumberFormatException => throw new ParseException(line => s"'$string' is not a valid float interval.\n At line $line")
    }
  }

  /**
    * @return un message d'échec de parse
    */
  override protected def getFailureMessage: String = s"'$tag': expected a float " + matchingToString

  /**
    * @return la conversion du matching en String
    */
  override protected[json_command_parser] def matchingToString: String = s"between $min and $max"
}
