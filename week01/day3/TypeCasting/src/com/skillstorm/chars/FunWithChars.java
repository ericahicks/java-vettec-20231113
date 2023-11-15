package com.skillstorm.chars;

public class FunWithChars {
	
	public static void main(String[] args) {
		// Treating a char as a number is allowed
		int x = 'a' + 'b'; // a is ascii number 97 and b is ascii number 98
		System.out.println("The value of 'a' + 'b' is: " + (char) x); 
		
		char eRotated = (char) ((int) 'e' + 2);
		char rRotated = 'r' + 2;
		char iRotated = 'i' + 2;
		char cRotated = 'c' + 2;
		char aRotated = 'a' + 2;
		System.out.println("Each letter rotated is: ");
		System.out.println(eRotated);
		System.out.println(rRotated);
		System.out.println(iRotated);
		System.out.println(cRotated);
		System.out.println(aRotated);
		System.out.println("Trying to send the message to someone:");
		System.out.println(eRotated + rRotated + iRotated + cRotated + aRotated);
		
		System.out.println(" " + eRotated + rRotated + iRotated + cRotated + aRotated);
		
		// Challenge: Write a program that prompts the user for a message to encode. 
		//             The message has to be 10 characters long.
		//             Print out the encoded message.
		
		// Challenge: Write a program that prompts the user for a encoded message.
		//             The message has to be 10 characters long.
		//             Print out the decoded message.
		
		// The encoding strategy is each letter is rotated 
		// rotated
		// 1
		// 3
		// 5
		// 7
		// ...
		
	}

	
}
