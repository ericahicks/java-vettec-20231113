package com.skillstorm.datatypes;

public class CharAndStringExamples {
	
	public static void main(String[] args) {
		// Example 1: char literals use single quotes
		char c = 'a'; 
//		String c2 = 'a';
		String c3 = "a"; 
		
		// Example 2: String concatenation (means to chain together)
		String name = "Erica " + "Hicks";
		System.out.println(name);
		
		String someCell = "2" + 2;
		System.out.println(someCell);
		
		// Example 3: concatenation only works if there is a String in the equation
		String d = 'c' + 2 + ""; // doesn't work if character and number 'c' + 2
		String e = "c" + 'c';
		
		
	}

}
