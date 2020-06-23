package fr.theogiraudet.json_command_parser.core.exception

import java.lang.reflect.Method
import java.util.List


sealed trait ExecutionResult {
  def isSuccess: Boolean = this.isInstanceOf[Success] || this.isInstanceOf[SuccessPipe]
  def isFailure: Boolean = !isSuccess

}

case class Success(parameters: List[AnyRef], method: Method) extends ExecutionResult
case class SuccessPipe(parameters: List[AnyRef], method: Method, queue: String) extends ExecutionResult
case class Failure(location: String, cause: Cause, expectedArguments: List[String]) extends ExecutionResult

sealed trait Cause
  case object BadArgument extends Cause
  case object ExpectedArgument extends Cause
  case object NoExpectedArgument extends Cause
  case object BadCommand extends Cause



