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

  def general(f: Int => Int, acc: Int)(reduce: (Int, Int) => Int)(lower: Int, upper: Int) : Int = {
    def loop(total: Int, lower: Int): Int = {
      if(lower > upper) total
      else loop(reduce(total, f(lower)), lower + 1)          
    }
    
    loop(acc, lower)    
  }
  
  def sigma2(f: Int => Int)(lower: Int, upper: Int) = {
    general(f, 0)((x: Int, y: Int) => x + y)(lower, upper)
  } 

  def factorial2(number: Int): Int = {
    general(x => x, 1)((x: Int, y: Int) => x*y)(1, number)
  }
  
}