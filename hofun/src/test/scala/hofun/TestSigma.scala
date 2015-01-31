package hofun

import org.scalatest.FlatSpec

class TestSigma extends FlatSpec {

   "Sigma method when passed in a function that returns itself" should
   "return the total of the value" in {
     def self(x: Int) = x
     assert(55 == SigmaObject.sigma(self, 1, 10))
   }

   "Sigma method when passed in a function that returns its square value" should
   "return the total of the square value" in {
     def square(x: Int) = x*x
     assert(385 == SigmaObject.sigma(square, 1, 10))
   }

   "Sigma method when passed in an anonymous function that returns its square value" should
   "return the total of the square value" in {
     assert(385 == SigmaObject.sigma((x: Int) => x*x, 1, 10))
   }

}