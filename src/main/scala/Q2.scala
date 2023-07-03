object Q2 {
    def patternMatching(number:Int):String = number match {
      case x if number <= 0 => "Negative/Zero"
      case x if number%2 == 0 => "Even"
      case x if number%2 != 0 => "Odd"
    }

    def main(args: Array[String]): Unit = {
      import scala.io.StdIn
      print("Enter a Number:");
      val input = StdIn.readInt();
      print("The number is an : " + patternMatching(input));
    }
}
