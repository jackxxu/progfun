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
   
   "Product method when pass in a function and two integers" should 
   "return the product of the function results of the numbers" in  {
     assert(3628800 == SigmaObject.product(x => x)(1, 10))
   }

   "Factorial method when pass in a function and two integers" should 
   "return the product of the function results of the numbers" in  {
     assert(120 == SigmaObject.factorial(5))
   }

   "Sigma2 method when passed in a function that returns itself" should
   "return the total of the value" in {
     def self(x: Int) = x
     assert(55 == SigmaObject.sigma2(self)(1, 10))
   }

   "Factorial2 method when pass in a function and two integers" should 
   "return the product of the function results of the numbers" in  {
     assert(120 == SigmaObject.factorial2(5))
   }
}