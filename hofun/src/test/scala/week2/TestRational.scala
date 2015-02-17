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
     assert(r1.add(r2) == r3)
   }

   "Rational sub method when passed in another object" should
   "return the difference of the values" in {
     val r1 = new Rational(1, 3)
     val r2 = new Rational(2, 3)
     assert(r2.sub(r1) == new Rational(3, 9))
   }

   "Rational sub method when passed in two subtractions" should
   "return the proper value" in {
     val x = new Rational(1,3)
     val y = new Rational(5,7)
     val z = new  Rational(3,2)
     assert(x.sub(y).sub(z) == new Rational(-79, 42))
   }

   "Rational neg method when passed in another object" should
   "return the negative of the value" in {
     val r1 = new Rational(1, 3)
     assert(r1.neg == new Rational(-1, 3))
   }

   "Rational add method when passed in another object" should
   "return the simplified version of the value" in {
     val r1 = new Rational(1, 3)
     assert(r1.add(r1) == new Rational(2, 3))
   }
}