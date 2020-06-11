package fr.theogiraudet.json_command_parser.core.command_argument

import java.lang.reflect.Method

import fr.theogiraudet.json_command_parser.core.exception._

import scala.jdk.CollectionConverters._
import scala.collection.mutable


abstract class Argument {

  private[json_command_parser] val children: mutable.Set[Argument] = mutable.Set()
  private[json_command_parser] var execute: Method = _
  private[json_command_parser] var keepValue: Boolean = false
  private[json_command_parser] var tag: String = _
  private[json_command_parser] var id: String = _

  protected[json_command_parser] val ID: String


  /**
    * @param input la chaîne de caractères à traiter
    * @return un couple de String dont le premier élément est la sous-chaîne préfixe la plus longue telle qu'il n'y a pas d'espace ou de virgule et le deuxième élément est le reste de la chaîne
    */
  protected final def readWord(input: String): (String, String) = input.span(c => c != ' ' && c != ',')

  /**
    * Initialise l'argument courant avec les informations de <i>arg</i>.
    * @param arg l'argument
    * @return l'argument courant
    */
  final def initializeWith(arg: Argument): Argument = {
    children.clear
    children.addAll(arg.children)
    execute = arg.execute
    keepValue = arg.keepValue
    tag = arg.tag
    id = arg.id
    this
  }

  /**
    * @param input la chaîne de caractères à traiter
    * @return un ExecutionResult décrivant la réussite du parse sur la suite de la commande
    */
  final def run(input: String): ExecutionResult = {
    val (result, queue) = parse(input)
    if(result.isDefined) {
            // Si la nouvelle input est vide mais qu'il n'y a pas de méthodes à exécuter, alors le noeud courant n'est pas un noeud terminal
            if(queue.isEmpty && execute == null)
              Failure(queue, ExpectedArgument, children.map(_.tag).toList.asJava)
            // Si la nouvelle input n'est pas vide, mais que le noeud courant n'a pas d'enfant et n'est donc pas terminal
            else if(queue.isEmpty)
              Success((if(keepValue) result.get :: Nil else List()).asJava, execute)
            else if(!queue.isEmpty && children.isEmpty)
              Failure(queue.trim, NoExpectedArgument, List().asJava)
            else {
              continue(queue.trim) match {
                case (Some(Success(parameters, method)), _) => Success(if(keepValue) (result.get +: parameters.asScala).asJava else parameters, method)
                //Aucun noeud ne corresponds
                case (_, Some(fail)) => fail
                case _ => Failure(queue.trim, BadArgument, children.map(_.getFailureMessage).toList.asJava)
              }
            }
    } else
      Failure(input, BadArgument, List(id).asJava)
  }

  /**
    * @return une liste de clés incompatibles avec le noeud courant dont l'ID est spécifié en premier élément du tuple
    */
  final def getIncompatibilities = (ID, defineIncompatibilities)

  /**
    * @return une liste de clés requises pour le noeud courant l'ID est spécifié en premier élément du tuple
    */
  final def getRequires = (ID, defineRequires)

  /**
    * @param input la chaîne de caractères à traiter
    * @return un Option encapsulant un ExecutionResult retourné par un argument ayant réussi à parser <i>input</i>
    */
  private def continue(input: String): (Option[ExecutionResult], Option[ExecutionResult]) = {
    val result = children.map(_.run(input))
    (result.find(_.isSuccess), result.find(fail => fail.isFailure && fail.asInstanceOf[Failure].cause != BadArgument))
  }

  /**
    * @param input la chaîne de caractères à traiter
    * @return un doublet tel que le premier élément est la valeur parsée si elle existe (sinon None) et le deuxième est le reste de la chaîne à faire traiter
    */
  protected[command_argument] def parse(input: String): (Option[AnyRef], String)

  /**
    * @return une liste de clés incompatibles avec le noeud courant
    */
  protected def defineIncompatibilities: Set[String] = Set()

  /**
    * @return une liste de clés requises pour le noeud courant
    */
  protected def defineRequires: Set[String] = Set()

  /**
    * @return un message d'échec de parse
    */
  protected def getFailureMessage: String

  /**
    * @return la conversion du matching en String
    */
  protected[json_command_parser] def matchingToString: String

  /**
    * Défini les restrictions sur le paramètre lu par l'exécuteur de commande
    * @param string la restriction
    */
  def defineMatches(string: String)

}
