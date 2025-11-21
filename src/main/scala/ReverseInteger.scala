object ReverseInteger {
  def main(args: Array[String]): Unit = {
    println(reverseInt(123))
    println(reverseInt(-123))
    println(reverseInt(120))
    println(reverseInt(0))
  }

  private def reverseInt(x: Int): Int = {
    x.sign * x.abs.toString.reverse.toInt
  }
}
