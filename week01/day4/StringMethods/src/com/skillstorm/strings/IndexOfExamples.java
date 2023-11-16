package com.skillstorm.strings;

public class IndexOfExamples {
	
	public static void main(String[] args) {
		// We can chain methods
		String str = "    hello hello     ";
		System.out.println(str.toUpperCase().trim().substring(2)); // .substring(n) starts at index n and goes to the end
		                                                           // .substring(n, m) start at index n and go to index m exclusive
		
		
		// IndexOf examlpes
		String cat = "Boots";
		System.out.println(cat);
		
		// Example 1:
		System.out.println(">> Look for the letter s");
		System.out.println("index of s is " + cat.indexOf('s'));
		System.out.println("index of S is " + cat.indexOf('S'));
		
		System.out.println("\n>> Looking for the letter o I get the first occurence " + cat.indexOf("o"));
		System.out.println("\n>> Looking for the letter o I get the last occurence " + cat.lastIndexOf("o"));
		
		// Example 2: Using indexOf(char, startLocation)
//		String students = "Jo\n" // look for \n characters to find each student
//				+ "Abdel\n" 
//				+ "Sam\n" 
//				+ "Nick";
		String students = "Jo, Abdelnasser, Sam, Nick";
		//                 --
		//                 0
		int indexOfComma = students.indexOf(",");
		String firstStudent = students.substring(0, indexOfComma);
		System.out.println("The first student is: " + firstStudent);
		
		int indexOfSecondComma = students.indexOf(",", indexOfComma + 1);
		String secondStudent = students.substring(indexOfComma + 1, indexOfSecondComma).trim();
		System.out.println("Second student is " + secondStudent);
		
		int indexOfNextComma = students.indexOf(",", indexOfSecondComma + 1);
		String nextStudent = students.substring(indexOfSecondComma + 1, indexOfNextComma);
		System.out.println("Next student is " + nextStudent);
		
		int indexOfLastComma = students.lastIndexOf(",");
		String lastStudent = students.substring(indexOfLastComma + 1).trim();
		System.out.println("Last student is " + lastStudent);
		
		
		
		
	}
	
	// We can write our own methods to reuse our code
	// Add the parameter to be able to customize what the method looks for
	public static void parseStudentListAndPrint(String delimiter) {
		
	}

}
