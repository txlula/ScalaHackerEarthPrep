object ZigzagConversion {
  def main(args: Array[String]): Unit = {
    println(convert("PAYPALISHIRING", 3))
    println(convert("PAYPALISHIRING", 4))
  }

  private def convert(s: String, numRows: Int): String = {
    val rows = Array.fill(numRows)(new StringBuilder())
    val step = (numRows * 2) - 2

    for (x <- 0 until s.length) {
      val r = x % step
      if (r < numRows) rows(r) += s(x)
      else rows(step - r) += s(x)
    }

    rows.mkString("")
  }
}
