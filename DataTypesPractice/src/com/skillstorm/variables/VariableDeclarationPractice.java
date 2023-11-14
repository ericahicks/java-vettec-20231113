package com.skillstorm.variables;

public class VariableDeclarationPractice {
	
	// These are outside a method so are properties of the class and get a default value
	// depending on the type
	int x; // defaults to 0
	String name; // defaults to null
	
	/*
	 * Data Type	Default Value (for fields)
		byte	0
		short	0
		int	0
		long	0L
		float	0.0f
		double	0.0d
		char	'\u0000'
		String (or any object)  	null
		boolean	false
	 */
	
	public static void main(String[] args) {
		// Any variable declared inside a method is called a 
		// "local variable" and is not given a default
		
		
		////////////////////////////////////////////
		// Example 1:
//		System.out.println("Hello world");
		// Declaring a variable we need a type and name
		int x;
		String name;
		char c;
//		String int; // can't use reserved words
		
		/////////////////////////////////////////////
		// Example 2:
		// Variable x is not initialized
//		System.out.println(x); // does not work
		x = 1;
		System.out.println(x);
		
		////////////////////////////////////////////////
		// Example 3: valid ways to initialize variables
		int y;
		y = 10;
		
		int z = 100;
		
		int a = 1, b = 2, d = 3; // b and d are int 
//		int e = 5, double f = 1.5; // invalid
		
		
		
		
	}

}
