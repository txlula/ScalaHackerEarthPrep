object LongestSubstring {
  def main(args: Array[String]): Unit = {
    longestSubstringLength("abcabcbb")
    longestSubstringLength("bbbbb")
    longestSubstringLength("pwwkew")
    longestSubstringLength("")
  }

  private def longestSubstringLength(s: String): Unit = {
    var length = 0
    var substring = ""

    for (x <- 1 to s.length) {
      var substrings = s.sliding(x).toList
      substrings = substrings.map(x => x.distinct)
      substrings = substrings.sortWith((x, y) => x.length > y.length).distinct

      if (s.contains(substrings.head)) {
        length = substrings.head.length
        substring = substrings.head
      }
    }

    println(s"The answer is \"$substring\", with the length of $length.")
  }
}
