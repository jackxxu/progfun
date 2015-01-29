package fileSearcher

import org.scalatest.FlatSpec
import java.io.File

class FilterCheckerTests extends FlatSpec {
  "When FileSearcher is passed a list where one file matches the filter" should 
  "return a list with that file" in {
    val matchingFile = new FileObject(new File("match"))
    val listOfFiles = List(matchingFile, FileObject(new File("random")))
    
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    
    assert(List(matchingFile) == matchedFiles)
  }
  
  "When FileSearcher is passed a list where one directory matches the filter" should 
  "not return that directory" in {
    val matchingDirectory = DirectoryObject(new File("match"))
    val listOfFiles = List(matchingDirectory, FileObject(new File("random")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles 
    
    assert(matchedFiles.length == 0)
  }
}