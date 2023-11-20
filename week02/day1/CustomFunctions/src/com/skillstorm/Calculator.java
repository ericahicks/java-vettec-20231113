package com.skillstorm;

// Example 3: Parameters and Return types
public class Calculator {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int sum = Calculator.add(x, y);
		System.out.println(sum);

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
	public static double divide(int x, int y) {
		return (double) x / y;
	}

}
