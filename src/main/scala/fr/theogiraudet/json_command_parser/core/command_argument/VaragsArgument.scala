package fr.theogiraudet.json_command_parser.core.command_argument

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters._
import scala.util.Try

class VaragsArgument(private val pattern: Argument) extends Argument {

  override protected[json_command_parser] val ID: String = "varargs"

  /**
    * @param input la chaîne de caractères à traiter
    * @return un triplet tel que le premier élément et la réussite du parse, le deuxième et la valeur parsée et la troisième est le reste de la chaîne à faire traiter
    */
  override protected[command_argument] def parse(input: String): (Option[AnyRef], String) = {
    var inp = input
    val list: ListBuffer[AnyRef] = ListBuffer()
    while(!inp.isEmpty) {
      pattern.parse(inp) match {
        case (Some(result), tail) => list += result; inp = tail.trim
        case (None, _) => return (None, input)
      }
    }
    (Some(list.asJava), "")
  }

  /**
    * @param input la valeur à tester
    * @return vrai si la valeur est valide selon l'argument, faux sinon
    */
  override protected[command_argument] def isValidInput(input: AnyRef): Boolean = {
    Try(input.asInstanceOf[java.util.List[AnyRef]]).filter(list => list.stream.allMatch(elem => pattern.isValidInput(elem))).isSuccess
  }

  /**
    * Défini les restrictions sur le paramètre lu par l'exécuteur de commande
    * @param string la restriction
    */
  override def defineMatches(string: String): Unit = pattern.defineMatches(string)

  /**
    * @return un message d'échec de parse
    */
  override protected def getFailureMessage: String = s"'$tag': expected varargs of '${pattern.ID}' " + matchingToString

  /**
    * @return la conversion du matching en String
    */
  override protected[json_command_parser] def matchingToString: String = pattern.matchingToString
}
