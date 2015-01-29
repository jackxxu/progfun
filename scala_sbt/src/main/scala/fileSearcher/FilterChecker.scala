package fileSearcher

class FilterChecker(val filter: String) {

  def matches(content: String): Boolean = content == filter
    
  def findMatchedFiles(list: List[IOObject]) =
    for(f <- list 
        if(matches(f.name))
        if(f.isInstanceOf[FileObject])) 
      yield f
}

object FilterChecker {
  def apply(name: String) = new FilterChecker(name)
}