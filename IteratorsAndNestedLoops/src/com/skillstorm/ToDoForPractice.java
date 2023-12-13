package com.skillstorm;

import java.util.Arrays;

public class ToDoForPractice {
	// TODO rewrite each for-each loop using an iterator
	public static void main(String[] args) {
/////////////////////////////////////////////
// Example 1: uppercase the fruits in the list pineapple strawberry banana
		String[] fruits = { "pineapple", "strawberry", "banana" };
		for (String s : fruits) {
			System.out.println(s.toUpperCase());
		}

		System.out.println(Arrays.toString(fruits));
/////////////////////////////////////////////
// Example 1: concatenate a list of animals
		String[] bigCats = { "tiger", "lion", "cougar", "cheetah", "puma" };
		String result = "";
		for (String cat : bigCats) {
			result += cat + " ";
		}
		System.out.println(Arrays.toString(bigCats));
		System.out.println(result);

// Example 1.5 Print out each letter on a separate line
		String str = "Will this work?";
//for (char c : str) { // This will not work! Java cannot extract the letters from the String for us
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
	}
}
