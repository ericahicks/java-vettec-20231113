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

	
	// Divide Examples from Lecture

}
