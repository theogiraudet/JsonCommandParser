package fr.theogiraudet.json_command_parser.core.command_argument

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters._
import scala.util.Try

class ListArgument(private val pattern: Argument) extends Argument {

  override protected[json_command_parser] val ID: String = "list"

  /**
    * @param input la chaîne de caractères à traiter
    * @return un triplet tel que le premier élément et la réussite du parse, le deuxième et la valeur parsée et la troisième est le reste de la chaîne à faire traiter
    */
  override protected[command_argument] def parse(input: String): (Option[AnyRef], String) = {
    if (input.charAt(0) == '[') {
      val list: ListBuffer[String] = ListBuffer()
      var depth = 1
      var inp = input.drop(1)
      var result = ""
      while(depth >= 1) {
        (inp.charAt(0), depth) match {
          case ('\u0000', _) => return (None, input)
          case (',', 1) => list += result.trim; result = "";
          case (']', 1) => depth -= 1
          case ('[', _) => depth += 1; result += '['
          case (']', _) => depth -= 1; result += ']'
          case (chr, _) => result += chr
        }
        inp = inp.drop(1)
      }
      list += result.trim
      val resultList = list.map(s => pattern.parse(s)).filter(tuple => tuple._1.isDefined && tuple._2.isEmpty).map(tuple => tuple._1.get)
      if(resultList.size == list.size)
        return (Some(resultList.asJava), inp)
    }
    (None, input)
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
    *
    * @param string la restriction
    */
  override def defineMatches(string: String): Unit = pattern.defineMatches(string)

  /**
    * @return un message d'échec de parse
    */
  override protected def getFailureMessage: String = s"'$tag': expected list of '${pattern.ID}'" + pattern.matchingToString

  /**
    * @return la conversion du matching en String
    */
  override protected[json_command_parser] def matchingToString: String = s" of '${pattern.ID}'" + pattern.matchingToString
}
