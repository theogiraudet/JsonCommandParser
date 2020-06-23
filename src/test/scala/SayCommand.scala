import java.util
import java.util.List

import fr.theogiraudet.json_command_parser.Command

class SayCommand extends Command {

  def says(text: Integer): Unit = {
    println("test")
  }

  override def defineSyntaxFile = "Say.jc"

}
