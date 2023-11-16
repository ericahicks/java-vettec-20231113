package com.skillstorm.strings;

public class StringEscapeCharacters {
	
	public static void main(String[] args) {
		String str = "Java\nJava";
		System.out.println("How long is this str? " + str.length());
		
		String newline = "\n";
		System.out.println("This is because newline is length " + newline.length());
		
		/*
		 * The \ is treated special in Strings
		 * 
		 * Escape sequences start with a backslash and count as a single character in the String
		 * \n is newline
		 * \t is tab
		 * \r is carriage return
		 * \\ is the \ character which is doubled so \ isn't treated special
		 * \" is the " character which is escaped so it doesn't end the current String
		 * 
		 * For example, to print out the sentence 
		 *  The \n is only one character not two.
		 */
		System.out.println("The \\n character is only one not two.");
	}

}
