package com.skillstorm;

public class HelloWorld {
	
	// Note: The order of the methods DOES NOT MATTER
	// but please place your main method at the very TOP or the very BOTTOM

	public static void main(String[] args) {
		///////////////////////////////////////////////////////////
		// Example 1: Call the custom method that prints Hello
		HelloWorld.printHello();
		// I can be lazy because I am in the HelloWorld class, omitting the name of the class is fine
		printHello();
		printHello();
		printHello();
		printHello();
		printHello();
		
		///////////////////////////////////////////////////////////
		// Example 2: What happens if you forget static?
		//            Call the custom method that prints Goodbye
		HelloWorld myInstance = new HelloWorld();
		myInstance.printGoodbye();
//		HelloWorld.printGoodbye(); 
		/*
		 * Unresolved compilation problem: 
	       Cannot make a static reference to the non-static method printGoodbye() from the type HelloWorld
		 */
		
	}
	
	////////////////////////////////
	// Example 1: Method declaration
	/**
	 * Method that prints Hello
	 */
	public static void printHello() {
		System.out.println("Hello");
//		printHello(); // A method CAN call itself but here we have let it call itself infinite times and it will run out of memory
	}
	
	////////////////////////////////////////////////
	// Example 2: Method declaration without static
	/**
	 * Method that prints Goodbye
	 */
	public void printGoodbye() {
		System.out.println("Goodbye");
	}
	
	

}
