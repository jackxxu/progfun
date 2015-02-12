package week2

class Rational(x: Int, y: Int) {
  
  def numer = x
  def denum = y

  def add(r: Rational) =
    new Rational(numer * r.denum + denum * r.numer, denum*r.denum)
  
  override def toString =
    numer + "/" + denum
    
  override def equals(o: Any) = o match {
    case that: Rational => that.numer == numer && that.denum == denum
    case _ => false
  }
}