package com.skillstorm;

public class ParameterNamesIgnoredExamples {

	public static void main(String[] args) {
		String firstName = "Erica";
		String lastName = "Hicks";
		greet(lastName, firstName); // What will this print
	}

	// Write a custom method that
	// - takes in a first name and last name such as John, Doe
	// - prints Hello, John Doe
	public static void greet(String firstName, String lastName) {
		System.out.println("Hello, " + firstName + " " + lastName);
	}

	// Does it matter the name of the local variables used to call the method?

	public static void divideExamples() {
		// Divide Examples from Lecture
		// 
		// Compile time polymorphism
		// - The Java Compiler first looks for an exact match method name(types)
		// - If there is no exact match, it looks for a method with compatible param
		// types
		System.out.println(divide(1, 2)); // calls the divide(int,int)

		System.out.println(divide(1.0, 2.0)); // calls the divide(double,double) method

		System.out.println(divide(1, 2.0)); // no exact match, but it finds compatible parameter types
											// calls divid(double,double)

		System.out.println(divide(1.0, 2)); // type casts - wide type casting
											// calls divid(double,double)

		System.out.println(divide((int) 1.5, 3)); // explicit narrow casting - it finds divide(int,int)
													// calls divid(int,int)

	}

	// Division - int
	// Declare a method that takes in two integers 
	// and returns an integer with the quotient
	
	///////////////////////////////////////////////////////////////////
	// Note: Cannot have two methods with same name and parameter types
	//        EVEN IF the names of the parameters vary
	// 
	//public static double divide(int a, int b) {
	//	return (double) a / b;
	//}
	//
	////////////////////////////////////////////////////////////////////
	
	public static double divide(double a, double b) {
		return (double) a / b;
	}

	public static int divide(int x, int y) {
		return x / y;
	}

}
