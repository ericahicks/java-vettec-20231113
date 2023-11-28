package com.skillstorm.groupwork;

public class GroupWork {
	public static void main(String[] args) {
		// Warm-up 1: Count to 100 by 2's
		/**
		 * Alternative solution, note the loop runs 100x so this will be slightly slower than
		 * the other solutions that only loop 50x
		 * @author Erica
		 */
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		/**
		 * @author Team Cave Bear - Steven, Sean, Rod
		 */
		for (int i = 0; i < 51; i++) {
			System.out.println(i * 2);
		}
		
		for (int i = 0; i < 101; i += 2) {
			System.out.println(i);
		}

		// Warm-up 2: Add up the numbers 1 to 10
		/**
		 * @author Team Dire Wolf - Josh, Tim, Matt
		 */
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.printf("Adding 1 through 10 results in: %d%n", result);
		System.out.println(result);
	}

	/**
	 * Reverse a String.
	 * 
	 * For example, given "Hello" it will return "olleH"
	 * 
	 * @param s The String to reverse
	 * @return A new String containing the characters in reverse order
	 * 
	 * @author Team Wooly Mammoth Hunter, Nick, Nasser
	 * 
	 */
	public static String challenge1(String str) {
		if (str == null || str.isEmpty() || str.length() == 1)
			return str;
		String startingstr = str;
		for (int n : str.toCharArray()) {
			if (str == startingstr) {
				str = "";
			}

			str = (char) n + str;
		}
		return str;
	}
	
	/**
	 * Another version with a guard clause.
	 * @param s
	 * @return The String reversed
	 * 
	 * @author Erica
	 */
	public static String reverseV2(String s) {
		// Guard clause
		if (s == null || s.isEmpty() || s.length() == 1)
			return s;
		// Reverse the String one character at a time
		//  Hello becomes olleH
		String result = "";
		for (char c : s.toCharArray()) {
			result = c + result;
		}
		return result;
	}

	/**
	 * Capitalizes every other letter in a String.
	 * 
	 * For example, given "hello" it will return "HeLlO"
	 * 
	 * @param s The String to capitalize
	 * @return A new String with every other letter capitalized
	 * 
	 * @author Team Saber Tooth Tiger - Sam, Saugat, Sean
	 * 
	 */
	public static String challenge2(String s) {
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				newString += s.toUpperCase().charAt(i);
			} else {
				newString += s.charAt(i);
			}
		}
		return newString;
	}

}
