object StringToInteger {
  def main(args: Array[String]): Unit = {
    println(myAtoi("32"))
    println(myAtoi("-42"))
    println(myAtoi("4193 with words"))
    println(myAtoi("words and 987"))
    println(myAtoi("-91283472332"))
  }

  private def myAtoi(s: String): Int = {
    try {
      val string = s.strip().replaceAll(" ", "").replaceAll("[a-zA-Z]", "")
      val sign = if (s(0).toString == "-") -1 else 1
      string.toInt * sign
    }
    catch {
      case e: NumberFormatException =>
        -2147483648
    }
  }
}
