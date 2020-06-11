package fr.theogiraudet.json_command_parser.core

import fr.theogiraudet.json_command_parser.core.command_argument.{Argument, BooleanArgument}
import fr.theogiraudet.json_command_parser.core.exception.ParseException

import scala.collection.immutable
import scala.collection.mutable.{Set, Stack}

/**
  * Représente une pile de contexte pour aider à détecter les incompatibilités entre les pairs.
  */
object ParserStack {

  private class Context(private[ParserStack] val beginLine: Int) {

    private[ParserStack] val incompatibilitySet: Set[(String, immutable.Set[String])] = Set()
    private[ParserStack] val requiresSet: Set[(String, immutable.Set[String])] = Set()
    private[ParserStack] val presentKeySet: Set[String] = Set()
    private[ParserStack] var argument: Argument = new BooleanArgument()

  }

  private val stack: Stack[Context] = Stack()

  /**
    * Défini un nouveau contexte à ajouter à la pile en sommet de pile.
    * @param line la ligne de début du contexte
    */
  def newContext(line: Int): Unit = stack.push(new Context(line))

  /**
    * Supprime le contexte en sommet de pile.
    * @return l'argument du contexte courant
    */
  def deleteContext: Argument = stack.pop.argument

  /**
    * Ajoute une incompatibilité à la liste du contexte en sommet de pile.
    * @param incompatibility une pair dont le premier élément est incompatible avec tous les éléments du second
    */
  private def addIncompatibility(incompatibility: (String, immutable.Set[String])): Unit = stack.top.incompatibilitySet += incompatibility

  /**
    * Ajoute un requis à la liste du contexte en sommet de pile.
    * @param requires une pair dont le premier élément est requis avec tous les éléments du second
    */
  def addRequires(requires: (String, immutable.Set[String])): Unit = stack.top.requiresSet += requires

  /**
    * Ajoute une clé à la liste des clés présentes dans le contexte en sommet de pile et ajoute les incompatibilités au contexte.<br/>
    * Si l'élément est déjà présent, déclenche une erreur.
    * @param element une clé
    */
  def addElement(element: String): Unit = {
    if(stack.top.presentKeySet.contains(element))
      throw new ParseException(line => s"'$element' key can only be defined once in the local context.\nAt line $line")
    stack.top.presentKeySet += element
  }

  /**
    * @return un Set de pair dont le premier élément est incompatible avec les éléments du second et dont tous les éléments sont dans la liste des clés présentes.
    */
  def foundIncompatibility = {
    stack.top.incompatibilitySet.map(pair => (pair._1, pair._2.intersect(stack.top.presentKeySet))).filter(pair => pair._2.nonEmpty)
  }

  /**
    * @return un Set de pair dont le premier élément requiert tous les éléments du second qui ne sont pas dans le contexte local.
    */
  def checkRequires = {
    stack.top.requiresSet.map(pair => (pair._1, pair._2.diff(stack.top.presentKeySet))).filter(pair => pair._2.nonEmpty)
  }

  /**
    * @return le numéro de ligne à laquelle débute le contexte en sommet de pile.
    */
  def getLine = stack.top.beginLine

  /**
    * @return l'argument correspondant au contexte courant
    */
  def getArgument: Argument = stack.top.argument

  /**
    * Permet de définir l'argument du contexte courant à <i>arg</i>.<br/>
    * Ajoute les incompatibilités de l'Argument au contexte.
    * @param arg
    */
  def setArgument(arg: Argument) = {
    stack.top.argument = arg
    addElement("type")
    addIncompatibility(arg.getIncompatibilities)
    addRequires(arg.getRequires)
  }

  /**
    *
    * @return vrai si le contexte courant est la racine, faux sinon.
    */
  def isEmpty = stack.size == 0

  /**
    * @param string une clé
    * @return vrai si la clé appartient au contexte, false sinon
    */
  def contains(string: String): Boolean = stack.top.presentKeySet.contains(string)


}
