package fileSearcher

import org.scalatest.FlatSpec

class FilterCheckerTests extends FlatSpec {
  "When FileSearcher is passed a list where one file matches the filter" should 
  "return a list with that file" in {
    val matchingFile = new FileObject("match")
    val listOfFiles = List(matchingFile, new FileObject("random"))
    
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    
    assert(List(matchingFile) == matchedFiles)
  }
  
  "When FileSearcher is passed a list where one directory matches the filter" should 
  "not return that directory" in {
    val matchingDirectory = new DirectoryObject("match")
    val listOfFiles = List(matchingDirectory, new FileObject("random"))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles 
    
    assert(matchedFiles.length == 0)
  }
}