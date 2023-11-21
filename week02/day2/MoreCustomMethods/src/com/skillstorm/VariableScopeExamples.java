package com.skillstorm;

// Variable Scopes
// - method scope
// - block scope
public class VariableScopeExamples {
	// Style: Put the variable declarations at the top of the method

	public static void main(String[] args) {
		doStuff();
//		printSum(1, 2);
//		System.out.println("x=" + x + ", y=" + y); // compilation error
		// Unresolved compilation problems: 
		// x cannot be resolved to a variable
		// y cannot be resolved to a variable
	}
	
	public static void printSum(int x, int y) {
		System.out.println("x=" + x + ", y=" + y + ", x + y = " + (x + y));
	}
	
//	public static void doStuff() {
//		int x = 10; // method scope variable
//		if (x < 20) {
//			int y = x; // block variable
//		} else {
//			int z = 2 * x; // block scope variable
//		}
//		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
//	}
	
	public static void doStuff() {
		int x = 10; // method scope variable
		int y = 0;
		int z = 0;
		/////////////////////////////////////////////////////////////////
		// Side Note:
		// int y = 10; // cannot redeclare
		y = 10; // can reassign
		////////////////////////////////////////////////////////////////
		// Note: A block scope cannot declare variables of the same name
		//       as variables in the outerscope
		////////////////////////////////////////////////////////////////
		if (x < 20) {
			y = x; // block variable
			System.out.println("I'm in if: x=" + x + ", y=" + y + ", z=" + z);
		} else {
			z = 2 * x; // block scope variable
			System.out.println("I'm in else: x=" + x + ", y=" + y + ", z=" + z);
		}
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}
	
	//////////////////////////////////////////////
	// Note: 
	// Nested blocks have access to outer block variables
	//
	// Outer blocks do not have access to inner blocks
	// 
	// Separate inner blocks don't have access to eachother's variables
	//   Ex: if-block and else-block have separate block scopes
	//         
	// 
	//////////////////////////////////////////////

}
