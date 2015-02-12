package week2

import org.scalatest.FlatSpec

class TestRational extends FlatSpec {

   "Rational add method when passed in the numerator and denumerator" should
   "return the same value in the numer and denum methods" in {
     val r1 = new Rational(1, 3)
     assert(r1.numer == 1)
     assert(r1.denum == 3)
   }

   "Rational add method when passed in the numerator and denumerator" should
   "return the toString value in the format of numerator/denumerator" in {
     val r1 = new Rational(1, 3)
     assert(r1.toString == "1/3")
   }

   "Rational add method when passed in another object" should
   "return the total of the value" in {
     val r1 = new Rational(1, 3)
     val r2 = new Rational(2, 3)
     val r3 = new Rational(9, 9)
     assert(r1.add(r2).toString == "9/9")
     assert(r1.add(r2) == r3)
   }
   
}