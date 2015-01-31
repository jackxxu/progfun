package hofun

object SigmaObject {
  
  def sigma(f: Int => Int, lower: Int, upper: Int) = {
    def loop(sum: Int, lower: Int): Int = {
      if(lower > upper) sum
      else loop(sum + f(lower), lower + 1)          
    }
    
    loop(0, lower)    
  }
  
  def product(f: Int => Int)(lower: Int, upper: Int): Int = {
    if(lower > upper) 1
    else f(lower)*product(f)(lower+1, upper)
  }
  
  def factorial(number: Int): Int = product(x => x)(1, number)

  def mapReduce(map: Int => Int, reduce: (Int, Int) => Int, zero: Int)(lower: Int, upper: Int) : Int = {
    def loop(total: Int, lower: Int): Int = {
      if(lower > upper) total
      else loop(reduce(total, map(lower)), lower + 1)          
    }
    
    loop(zero, lower)    
  }
  
  def sigma2(f: Int => Int)(lower: Int, upper: Int) = {
    mapReduce(f, (x: Int, y: Int) => x + y, 0)(lower, upper)
  } 

  def factorial2(number: Int): Int = {
    mapReduce(x => x, (x: Int, y: Int) => x*y, 1)(1, number)
  }
  
}