package com.skillstorm;

import java.util.Arrays;

public class ToDoForPractice {
	
	// TODO rewrite each for-each loop using an iterator
	public static void main(String[] args) {
	/////////////////////////////////////////////
	// Example 1: Uppercase the fruits in the list
		String[] fruits = { "pineapple", "strawberry", "banana" };
		for (String s : fruits) {
			System.out.println(s.toUpperCase());
		}

		System.out.println(Arrays.toString(fruits));
		
		/////////////////////////////////////////////
		// Example 2: concatenate a list of animals
		String[] bigCats = { "tiger", "lion", "cougar", "cheetah", "puma" };
		String result = "";
		for (String cat : bigCats) {
			result += cat + " ";
		}
		System.out.println(Arrays.toString(bigCats));
		System.out.println(result);

		
		/////////////////////////////////////////////////////
		// Example 3: print each character on a separate line
		String str = "Will this work?";
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
	}
}
