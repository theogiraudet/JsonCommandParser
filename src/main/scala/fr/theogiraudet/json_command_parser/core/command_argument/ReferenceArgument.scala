package fr.theogiraudet.json_command_parser.core.command_argument

import fr.theogiraudet.json_command_parser.core.{Actions, ParserStack}

import scala.util.Try

class ReferenceArgument extends Argument {

  override protected[json_command_parser] val ID: String = "reference"

  protected[json_command_parser] var refereTo: Argument = _;

  /**
    * @param input la chaîne de caractères à traiter
    * @return un doublet tel que le premier élément est la valeur parsée si elle existe (sinon None) et le deuxième est le reste de la chaîne à faire traiter
    */
  override protected[command_argument] def parse(input: String): (Option[AnyRef], String) = refereTo.parse(input)

  /**
    * @param input la valeur à tester
    * @return vrai si la valeur est valide selon l'argument, faux sinon
    */
  override protected[command_argument] def isValidInput(input: AnyRef): Boolean = refereTo.isValidInput(input)

  /**
    * @return un message d'échec de parse
    */
  override protected def getFailureMessage: String = ""

  /**
    * @return la conversion du matching en String
    */
  override protected[json_command_parser] def matchingToString: String = ""

  /**
    * Défini les restrictions sur le paramètre lu par l'exécuteur de commande
    *
    * @param string la restriction
    */
  override def defineMatches(string: String): Unit = Actions.referenceSet += ((this, string, ParserStack.getLine))

}
