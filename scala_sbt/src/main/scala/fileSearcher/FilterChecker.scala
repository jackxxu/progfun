package fileSearcher

class FilterChecker(val name: String) {

  def findMatchedFiles(list: List[FileObject]) =
    list(1)
}