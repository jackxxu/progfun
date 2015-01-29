package fileSearcher

import java.io.File

class Matcher(val filter: String, val file_or_dir: String) {

    def execute() = {
      val matchee = FileConverter.convertToIOObject(new File(file_or_dir))
      val matchedFiles = matchee match {
        case file : FileObject => List(file.name)
        case directory : DirectoryObject => List()
        case _ => List()
      }
      matchedFiles
    }
}