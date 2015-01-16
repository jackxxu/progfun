package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c < 0 || r < 0 || c > r)
      0
    else if (c == r || c == 0)
      1
    else
      pascal(c-1, r-1) +  pascal(c, r-1)     

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(net_left_paras: Int, cs: List[Char]): Boolean = {
      if (net_left_paras < 0) false
      else if (cs.isEmpty) net_left_paras == 0
      else if (cs.head == '(') loop(net_left_paras + 1, cs.tail)
      else if (cs.head == ')') loop(net_left_paras - 1, cs.tail)
      else loop(net_left_paras, cs.tail)
    }
    loop(0, chars)
  }                     

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(m: Int, c: List[Int]): Int = {
      if(m == 0)  1
      else if(c.isEmpty) 0
      else {
        var total = 0
        var sum = m;
        do {
          total = total + loop(sum, c.tail)
          sum = sum - c.head
        } while( sum >= 0 )
        total
      }
    }

    if(money == 0) 0
    else if (coins.isEmpty) 0
    else {
      loop(money, coins)
    }
  }
}
