package com.skillstorm;

import java.util.Arrays;

public class CreatingArraysExamples {

	public static void main(String[] args) {
		// Using literal values inside { }
		int[] numbers = { 1, 2, 3 };
		System.out.format("Printing out the value in an array variable: %s%n", numbers);
		System.out.format("Printing out an array converted to a String: %s%n", Arrays.toString(numbers));
		
		// Using ____ ??????
		int[] evens = new int[10];
		System.out.format("Printing out the value in an array variable: %s%n", evens);
		System.out.format("Printing out an array converted to a String: %s%n", Arrays.toString(evens));
		
		// Using a combination of the two ways above
//		int[] odds = new int[5] {1, 3, 5, 7}; // lengths don't match, 
												// Java saves us from ourselvse and 
													// doesnt allow us to provide both
		
		int[] odds = new int[] {1, 3, 5, 7};
		System.out.format("Printing out the value in an array variable: %s%n", odds);
		System.out.format("Printing out an array converted to a String: %s%n", Arrays.toString(odds));
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////////
		// Aside: 
		// Cool example about char arrays
		//
		// Side note: How literal values are typed by Java
		// 98 is an int
		// 98L
		// 9.8 is an double
		// 9.8f
		///////////////////////////////////////////////////////////////////////////////////
		// How are we able to store what Java normally types as an int into a char without casting?
		// 
		// literals less than 62000 can be stored as char and automatically
		// literals less than 127 can be stored as bytes and automatically treated as byte
		char charray[] = {98, 102, 103, 104, 105}; // chars are really just numbers between 0 and 62,000
		//
		/////////////////////////////////////////////////////////////////////////////////
		// Why does it print the letters instead of the memory?
		//    Like Strings java automatically does follow the reference and print the contents in memory
		System.out.println(charray); // very cool, it prints the letters
		//
		char charray2[] = "bfghi".toCharArray();
		System.out.println(charray2);
		//
		System.out.println(charray[0]); // prints the char because treated as ascii value
//		System.out.println(charray[0], charray[1]); // println doesn't accept multiple values
		System.out.println(charray[0] + charray[1]); // adding char does not do string concatenation
		System.out.println(charray[0] + "" + charray[1]);
		////////////////////////////////////////////////////////////////////////////////
		
	}

}
