package fileSearcher

import org.scalatest.FlatSpec

class MatcherTests extends FlatSpec {

  "Matcher that is passed a file that matches the filter" should 
  "not return that file" in {
    val matcher = new Matcher("match", "match_phrase")
    val results = matcher.execute();
    println("3"*100)
    println(results)
    assert(results == List("match_phrase"))
  }

}