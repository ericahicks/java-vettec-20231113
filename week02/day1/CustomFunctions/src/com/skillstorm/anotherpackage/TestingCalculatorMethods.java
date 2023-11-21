package com.skillstorm.anotherpackage;

import com.skillstorm.Calculator;
// To import everything (all the classes from a package) use .*
import com.skillstorm.*;

public class TestingCalculatorMethods {
	
	public static void main(String[] args) {
		// Example 4: Calling methods from a different class
		
		// Call the addition method from the Calculator class with different inputs
		
		// Call the subtraction method from the Calculator class with different inputs
		// Parameter ORDER MATTERS
		
		// Call the multiplication method
		
		// Call the division method with 2 and 1 then call it again with 1 and 2
		// Parameter ORDER MATTERS
		double result = Calculator.divide(1, 2); // This is integer math so we lose the decimal 0.5
		System.out.println(result);
		
		result = Calculator.divide(2, 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(result); // floating point division by 0 gives you Infinity
		// Call the division method with 2 and 0
		
		
	}

}
