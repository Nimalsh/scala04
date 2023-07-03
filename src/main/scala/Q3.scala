object Q3 {
  def toUpper(input: String): String = input.toUpperCase()

  def toLower(input: String): String = input.toLowerCase()

  def formatNames(name: String)(formatFn: String => String): String = formatFn(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
      val formattedName = formatNames(name) {
        case str if str.length % 2 == 0 => toUpper(str)
        case str => toLower(str)
      }

      println(formattedName)
    }
  }



}
