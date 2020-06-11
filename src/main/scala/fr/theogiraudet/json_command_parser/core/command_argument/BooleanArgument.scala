package fr.theogiraudet.json_command_parser.core.command_argument

class BooleanArgument extends Argument {

  override protected[json_command_parser] val ID: String = "boolean"

  /**
    * @param input la chaîne de caractères à traiter
    * @return un triplet tel que le premier élément et la réussite du parse, le deuxième et la valeur parsée et la troisième est le reste de la chaîne à faire traiter.
    */
  override protected[command_argument] def parse(input: String): (Option[AnyRef], String) = {
    val (word, queue) = readWord(input)
    (word.toBooleanOption.map(_.asInstanceOf[AnyRef]), queue)
  }

  /**
    * @return un message d'échec de parse
    */
  override protected def getFailureMessage: String = s"'$tag': expected 'true' or 'false'"

  /**
    * @return une liste de clés incompatibles avec le noeud courant
    */
  override protected def defineIncompatibilities: Set[String] = Set("matches")

  /**
    * Défini les restrictions sur le paramètre lu par l'exécuteur de commande
    * @param string la restriction
    */
  override def defineMatches(string: String): Unit = ()

  /**
    * @return la conversion du matching en String
    */
  override protected[json_command_parser] def matchingToString: String = ""
}
