package com.skillstorm;

// Example 3: Parameters and Return types
public class Calculator {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int sum = Calculator.add(x, y);
		System.out.println(sum);
		
		// Divide example
		// Compile time polymorphism
		//  - The Java Compiler first looks for an exact match method name(types)
		//  - If there is no exact match, it looks for a method with compatible param types
		System.out.println(divide(1, 2)); // calls the divide(int,int)
		
		System.out.println(divide(1.0, 2.0)); // calls the divide(double,double) method
		
		System.out.println(divide(1, 2.0)); // no exact match, but it finds compatible parameter types
											// calls divid(double,double)
		
		System.out.println(divide(1.0, 2)); // type casts - wide type casting
											// calls divid(double,double)

		
		System.out.println(divide((int) 1.5, 3)); // explicit narrow casting - it finds divide(int,int)
													// calls divid(int,int)

	}
	
	// Addition
	// Declare a method that takes in two integers and returns an integer with the sum
	public static int add(int x, int y) {
	   return x + y;
	}
	
	
	// Subtraction
	
	// Multiplication
	
	// Division - int 
	// Declare a method that takes in two integers and returns an integer with the quotient
//	public static double divide(int a, int b) {
//		return (double) a / b;
//	}
	public static double divide(double a, double b) {
		return (double) a / b;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}

}
