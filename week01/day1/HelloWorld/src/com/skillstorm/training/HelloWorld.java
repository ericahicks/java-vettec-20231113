package com.skillstorm.training;

// This is a comment that the compiler ignores it's just for humans reading this file
// Shortcuts:
//  F11 runs the program (or use the green arrow button)
//  CTRL-FORWARD SLASH  comments out the line
//  sysout CTRL-SPACE will generate System.out.println();

/*
 * This is a multiline comment 
 * It's great for longer descriptions
 */

/*
 * Important syntax:
 *   - wrap all your code in curly braces
 *   - make sure your class is named the same as the file
 *   - the class with the main method must be public (aka visible to everyone)
 *   
 */
public class HelloWorld { 
	
	/*
	 * static - belongs to the class (we don't need an object to use this method)
	 * void - no return type (no data returned, this method just has the side effect of printing to the screen)
	 * main - the name of the function aka method name
	 * String[] args = the type and name of the inputs
	 * String - a sequence of characters
	 * 
	 */
	public static void main(String[] args) { // MEMORIZE
		
		System.out.println("Hello World");
		System.out.println();
	}

}
