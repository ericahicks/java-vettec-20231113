package com.skillstorm.userinput;

// I want to use code from the Scanner class in the java core library package java.util
import java.util.Scanner;

public class ScannerExamples {
	
	public static void main(String[] args) {
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		System.out.print("Enter your name: "); // print will not go to the next line unlike println
		String name = scanner.nextLine();
		System.out.println("Thanks, " + name);
		
		// Read in the next "token"
		System.out.println("How many cats do you have? ");
		int numCats = scanner.nextInt();
		System.out.print("Wow, you have " + numCats + " cats!");
		
		scanner.close();
		
	}

}
