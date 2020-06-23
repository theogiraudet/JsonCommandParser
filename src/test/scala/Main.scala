import fr.theogiraudet.json_command_parser.{CommandExecutor, CommandParser}

object Main extends App {

  /*CommandParser.parseCommand(new EnumCommand)
  CommandParser.parseCommand(new ListCommand)*/

  println(CommandExecutor.execute("enum 10 & bound $-1"))

}
