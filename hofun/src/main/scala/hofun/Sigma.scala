package hofun

object SigmaObject {
  
  def sigma(f: Int => Int, lower: Int, upper: Int): Int =
    if(lower > upper ) 0
    else f(lower) + sigma(f, lower + 1, upper)
}