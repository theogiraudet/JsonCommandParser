package fr.theogiraudet.json_command_parser.core.exception

import fr.theogiraudet.json_command_parser.core.UtilLex
import jdk.nashorn.internal.ir.annotations.Immutable

@Immutable
class ParseException(message: Int => String, line: Int = UtilLex.lineNumber) extends Exception {


  override def fillInStackTrace(): Throwable = this

  override def toString = "ParseException: " + message.apply(line)

}
