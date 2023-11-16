package com.skillstorm.strings;

public class LectureExample {
	
	public static void main(String[] args) {
		// Example 1: Strings are immutable so I must store the new version of the String in a variable
		String str = "Hello";
		System.out.println("str = " + str);
		str.toUpperCase();
		System.out.println("\n>> Trying to all uppercase str");
		System.out.println("str is still " + str);
		
		
		
		
		// Example 2: I can call a method on str while passing it to the println method
		System.out.println("\n>> Trying to all uppercase str while calling println");
		System.out.println("str uppercase is " + str.toUpperCase());
		
		
		
		
		// Example 3: 
		System.out.println("\n>> Checking what str is currently");
		// more code 
		System.out.println("str = " + str);
		
		System.out.println("\n>> Storing the result of str.toUpperCase()");		
		String uppercaseVersion = str.toUpperCase();
		System.out.println("uppercaseVersion = " + uppercaseVersion);
		
		System.out.println("\n>> Calling toUpperCase() again to see if it is in a new location in memory:");
		String uppercaseCreatedAgain = str.toUpperCase();
		System.out.println("uppercaseCreatedAgain = " + uppercaseCreatedAgain);
		
		System.out.println("\nAre they the same memory address? " 
					+ (uppercaseVersion == uppercaseCreatedAgain)); // compares the bits in the local variable
		System.out.println("Are they equal using the String class's .equals() method? " 
					+ uppercaseVersion.equals(uppercaseCreatedAgain));
		
		System.out.println("\n>> Creating two variables with the same string literal stored in them.");
		String hello = "HELLO";
		String hello2 = "HELLO";
		System.out.println("hello = " + hello);
		System.out.println("hello2 = " + hello2);
		System.out.println("Are they equal using the == operator? " + (hello == hello2));
		System.out.println("Are they equal using the String class's .equals() method? "
				+ (hello.equals(hello2)));
	}

}
