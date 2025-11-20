object AddTwoNumbers {
  def main(args: Array[String]): Unit = {
    println(addTwoNumbers(List(2,4,3), List(5,6,4)))
    println(addTwoNumbers(List(0), List(0)))
    println(addTwoNumbers(List(9,9,9,9,9,9,9), List(9,9,9,9)))
  }

  private def addTwoNumbers(l1: List[Int], l2: List[Int]): List[Int] = {
    var num1String = ""
    for (num <- l1) {
      num1String = num1String + num.toString
    }
    val num1 = num1String.reverse.toInt

    var num2String = ""
    for (num <- l2) {
      num2String = num2String + num.toString
    }
    val num2 = num2String.reverse.toInt

    val sum = num1 + num2
    sum.toString.split("").map(x => x.toInt).toList.reverse
  }
}
