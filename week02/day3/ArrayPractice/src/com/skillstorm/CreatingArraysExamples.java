package com.skillstorm;

import java.util.Arrays;

public class CreatingArraysExamples {

	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////////////
		// Example 1:
		// Using literal values inside { }
		int[] numbers = { 1, 2, 3 };
		System.out.format("Printing out the value in an array variable: %s%n", numbers);
		System.out.format("Printing out an array converted to a String: %s%n", Arrays.toString(numbers));
		
		///////////////////////////////////////////////////////////////////////////////
		// Example 2:
		// Using new operator
		int[] evens = new int[10];
		System.out.format("Printing out the value in an array variable: %s%n", evens);
		System.out.format("Printing out an array converted to a String: %s%n", Arrays.toString(evens));
		
		// Using a combination of the two ways above
//		int[] odds = new int[4] {1, 3, 5, 7}; // lengths don't match, 
												// Java saves us from ourselvse and 
													// doesnt allow us to provide both
		
		////////////////////////////////////////////////////////////////////////
		// Example 3: 
		// Using new and literal values
		// 
		// Invalid Examples:
		//  = new int[4]{};
		//  = new int[4]{1, 2, 3, 4};
		//  = int[4] odds = new int[]; 
		int[] odds = new int[]{1, 3, 5, 7};
		System.out.format("Printing out the value in an array variable: %s%n", odds);
		System.out.format("Printing out an array converted to a String: %s%n", Arrays.toString(odds));
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////
		// Aside: How does Java decide the type of the literal values? 
		// 98 is an int
		// 98L is a long
		// 9.8 is an double
		// 9.8f is a float
		
		///////////////////////////////////////////////////////////////////////////////////
		// Example 5:
		// How are we able to store what Java normally types as an int into a char without casting?
		char charray[] = {98, 102, 103, 104, 105}; // chars are really just numbers between 0 and 62,000

		// literals between 0 and 62000 can be stored as char
		// literals between -32000 and 32000 can be stored as short
		// literals between -128 and 127 can be stored as bytes

		/////////////////////////////////////////////////////////////////////////////////
		// Example 6:
		// Why does it print the letters instead of the memory?
		//    Like String java automatically does follow the reference and print the contents in memory
		System.out.println(charray); // very cool, it prints the letters not memory address
		
		char charray2[] = "bfghi".toCharArray();
		System.out.println(charray2); // very cool, it prints the letters not memory address
		System.out.println(charray[0]); // prints the char because treated as ascii value
		
		String strray[] = {"b", "f", "g", "h", "i"}; // does not work with String[]
		System.out.println(strray); // prints memory address [Ljava.lang.String;@4e25154f
		
		///////////////////////////////////////////////////////////////////////////////////
		// Example 7:
		// Aside on printing out char values using System.out.println
//		System.out.println(charray[0], charray[1]); // println doesn't accept multiple values
		System.out.println(charray[0] + charray[1]); // adding char does not do string concatenation
		System.out.println(charray[0] + "" + charray[1]);
		////////////////////////////////////////////////////////////////////////////////
		
	}

}
