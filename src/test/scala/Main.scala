import fr.theogiraudet.json_command_parser.{CommandExecutor, CommandParser}

object Main extends App {

  CommandParser.parseCommand(new SayCommand)

  println(CommandExecutor.execute("say test 15"))

}
