package com.skillstorm.userinput;

// I want to use code from the Scanner class in the java core library package java.util
import java.util.Scanner;

public class ScannerExamples {
	
	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		///////////////////////////////////////
		// Example 1:
		System.out.print("Enter your name: "); // print will not go to the next line unlike println
		String name = scanner.nextLine();
		System.out.println("Thanks, " + name);
		
		///////////////////////////////////////
		// Example 2:
		// Read in the next "token" value of type int
		System.out.print("How many cats do you have? ");
		int numCats = scanner.nextInt();
		System.out.println("Wow, you have " + numCats + " cats!");
		
		//////////////////////////////////////
		// Example 3: 
		// Make sure to read in a newline otherwise your next question will be answered with ""
		String next = scanner.nextLine();
		System.out.println(".nextLine() only read in: " + next);
		
		System.out.println("What are their names? "); // extra newline
		
		///////////////////////////////////////
		// Example 3:
//		// Note, next() will only read up to the first whitespace 
//		System.out.println("Enter in the text \"Java is Awesome!\"");
//		scanner.close();
		
	}

}
