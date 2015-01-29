package fileSearcher

import org.scalatest.FlatSpec

class FilterCheckerTests extends FlatSpec {
  "When FileSearcher is passed a list where one file matches the filter" should 
  "return a list with that file" in {
    val matchingFile = new FileObject("match")
    val listOfFiles = List(new FileObject("match"), new FileObject("random"))
    val matchedFiles = new FilterChecker("match").findMatchedFiles(listOfFiles)
    assert(List(matchingFile) == matchedFiles)
  }
}