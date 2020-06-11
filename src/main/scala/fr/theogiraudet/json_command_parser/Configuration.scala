package fr.theogiraudet.json_command_parser

object Configuration {

  private var debug: Boolean = false
  private var prefix: String = "/"
  private var commandSyntaxRoot: String = ""

  /**
    * Active/Désactive le mode "debug".
    * @param bool un boolean
    */
  def setDebug(bool: Boolean) = debug = bool

  /**
    * @return vrai si le mode "debug" est activé, faux sinon
    */
  def getDebug: Boolean = debug

  /**
    * Défini le prefixe des commandes.
    * @param prefix une chaîne de caractères
    */
  def setPrefix(prefix: String) = this.prefix = prefix

  /**
    * @return le préfixe des commandes
    */
  def getPrefix: String = prefix

  /**
    * Défini la racine des fichiers syntaxe des commandes. Les chemins d'accès spécifiées dans les classes seront relatif à ce répertoire.
    * @param root une chaîne de caractères
    */
  def setCommandSyntaxRoot(root: String) = commandSyntaxRoot = root

  /**
    * @return la racine des fichiers syntaxe des commandes
    */
  def getCommandSyntaxRoot: String = commandSyntaxRoot

}
