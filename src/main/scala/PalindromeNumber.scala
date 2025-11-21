object PalindromeNumber {
  def main(args: Array[String]): Unit = {
    println(palindrome(121))
    println(palindrome(-121))
    println(palindrome(10))
    println(palindrome(-101))
  }

  def palindrome(x: Int): Boolean = {
    val reversedString = x.toString.reverse
    val stringInt = x.toString

    if (reversedString == stringInt) true else false
  }
}
