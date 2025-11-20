object LongestPalindromicSubstring {
  def main(args: Array[String]): Unit = {
    println(palindrome("babad"))
    println(palindrome("cbbd"))
    println(palindrome("a"))
    println(palindrome("ac"))
  }

  private def palindrome(s: String): String = {
    var substring = ""

    for (x <- 1 to s.length) {
      val substrings = s.sliding(x).toList
      substrings.foreach(x => if x == x.reverse && x.length > substring.length then substring = x)
    }

    substring
  }
}
