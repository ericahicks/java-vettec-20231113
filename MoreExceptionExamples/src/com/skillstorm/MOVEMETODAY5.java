package com.skillstorm;

import java.util.ArrayList;
import java.util.Arrays;

public class MOVEMETODAY5 {

	public static void main(String[] args) {
		// Example 1: How can I add multiple values at once?
		// - Use the Arrays.asList(_, _, _, _) and the constructor that takes in a list
		
		ArrayList<String> veggies
//				= new ArrayList<String>("brocolli", "spinach"); // NO
//				= new ArrayList<>(new String[] {"carrot", "tomato", "cucumber"}); // NO
				= new ArrayList<>(Arrays.asList("brocolli", "spinach", "kale")); // YEP! 
		// Constructors available:
		//   public ArrayList<>() 
		//   public ArrayList<>(int capacity)
		//   public ArrayList<>(Collection<> lst)
		System.out.println(veggies);
		veggies.add("carrots");
		veggies.add("carrots");

		ArrayList<String> fruits = new ArrayList<>(
				Arrays.asList("apples", "bananas", "mangos", "apples", 
								"grapes", "papaya", "apples"));
		System.out.println(fruits);
		fruits.remove("apples");
		System.out.println(fruits);
		fruits.removeAll(Arrays.asList("apples"));
		System.out.println(fruits);

	}

}
