package hofun

object SigmaObject {
  
  def sigma(f: Int => Int, lower: Int, upper: Int): Int = {
    def loop(sum: Int, lower: Int): Int = {
      if(lower > upper) sum
      else loop(sum + f(lower), lower + 1)          
    }
    
    loop(0, lower)    
  }
    
}