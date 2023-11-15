package com.skillstorm.chars;

import java.util.Scanner;
/* Useful special characters to use in Strings:
 * - \n for newline
 * - \" for quotation marks (otherwise it will try to end the String)
 * - \\ for back slash (otherwise it will expect the next letter to be part of a special character
 * - 
 */
public class ScannerDelimiters {
	
	public static void main(String[] args) {
		// Problem: Scanner doesn't read in spaces at the end of an input
		// because it reads in "tokens" not the entire input
		// and the scanner is using whitespace as the delimiter between tokens
		String input = "hello";
		Scanner scanner1 = new Scanner(input); // you can use a string or file instead of System.in
		System.out.println("scanner1.nextLine() read in: \"" + scanner1.next() + "\"");
		scanner1.close();
		
		// Solution: Change the delimiter to # 
		// and require the user to input their message followed by the #
		input = "#hello  \nhello#";
		Scanner scanner = new Scanner(input);
		scanner.useDelimiter("#");
		
		// Example 1: Use .next()
		// Expected Output: 
		//  scanner.next() read in "hello   
		//  hello"
		System.out.println("scanner.next() read in \"" + scanner.next() + "\"");
		scanner.close(); 
		
		Scanner scanner2 = new Scanner(input);
		scanner2.useDelimiter("#");
		
		
		// Example 2: Use .nextLine()
		// Expected Output: scanner.nextLine() read in "#hello  #"
		System.out.println("scanner2.nextLine() read in \"" + scanner2.nextLine() + "\""); 
		scanner2.close();
		
		// Example 3: You can also use the newline  character as the delimiter using the symbol "\n"
		input = "hello  \n";
		Scanner scanner3 = new Scanner(input);
		scanner3.useDelimiter("\n");
		System.out.println("scanner3.next() read in \"" + scanner3.next() + "\"");
		
		scanner3.close();
	}

}
