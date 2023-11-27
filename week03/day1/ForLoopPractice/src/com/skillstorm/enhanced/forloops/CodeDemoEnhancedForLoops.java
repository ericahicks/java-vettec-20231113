package com.skillstorm.enhanced.forloops;

import java.util.Arrays;

public class CodeDemoEnhancedForLoops {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////
		// Example 1: uppercase the fruits in the list pineapple strawberry banana
		String[] fruits = {"pineapple", "strawberry", "banana"};
		for (String s : fruits) {
			System.out.println(s.toUpperCase());
		}
		
		System.out.println(Arrays.toString(fruits));
		/////////////////////////////////////////////
		// Example 1: concatenate a list of animals
		String[] bigCats = {"tiger", "lion", "cougar", "cheetah", "puma"};
		String result = "";
		for (String cat : bigCats) {
			result += cat + " ";
		}
		System.out.println(Arrays.toString(bigCats));
		System.out.println(result);
		
		// Example 1.5 Print out each letter on a separate line
		String str = "Will this work?";
//		for (char c : str) { // This will not work! Java cannot extract the letters from the String for us
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
		
	}
	
	// Example 3: String utility method for concatenating with spaces
	/**
	 * Returns a String with the elements of the array concatenated with spaces in between.
	 * 
	 * @param words A String array
	 * @return A String containing the elements separated by spaces
	 */
	public static String joinWithSpaces(String[] words) {
		String result = "";
		for (String word : words) {
			result += word + " ";
		}
		return result.trim();
	}
	
	

}
