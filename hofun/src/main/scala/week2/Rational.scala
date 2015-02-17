package week2

class Rational(x: Int, y: Int) {
  
  def numer = x / gcd(x, y)
  def denum = y / gcd(x, y)

  def add(r: Rational) =
    new Rational(numer * r.denum + denum * r.numer, denum*r.denum)
 
  def sub(r: Rational) =
    add(r.neg)

  def neg =
    new Rational(-numer, denum)

  override def toString =
    numer + "/" + denum
    
  override def equals(o: Any) = o match {
    case that: Rational => that.numer == numer && that.denum == denum
    case _ => false
  }
  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}