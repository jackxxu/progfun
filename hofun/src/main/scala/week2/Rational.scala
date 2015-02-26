package week2

class Rational(x: Int, y: Int) {
  
  require( y != 0, "the denomination can not be zero")
  
  val numer = x // / gcd(x, y)
  val denum = y // / gcd(x, y)

  def add(r: Rational) =
    new Rational(numer * r.denum + denum * r.numer, denum*r.denum)
 
  def sub(r: Rational) =
    add(r.neg)

  def neg =
    new Rational(-numer, denum)

  override def toString = {
    val gcd1  = gcd(numer, denum)
    numer/gcd1 + "/" + denum/gcd1
  }
    
//  override def equals(o: Any) = o match {
//    case that: Rational => that.numer == numer && that.denum == denum
//    case _ => false
//  }

  override def equals(o: Any) = o.toString == this.toString
  
  def less(that: Rational) = numer * that.denum < that.numer * denum
  
  def max(that: Rational) = if (this.less(that)) that else this
  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}