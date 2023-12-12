package com.skillstorm.codedemo;

import java.util.ArrayList;

public class WrapperPractice {
	

	
	public static void main(String[] args) {
		///////////////////////////////////////////////
		// Example 1: arraylist can store only one type and it's subtypes Animal->Cat,Dog,Bird
		ArrayList<Number> numbers = new ArrayList<>();
		numbers.add(1);// autoboxing int --> Integer
		numbers.add(1.0); // autoboxing double --> Double
		numbers.add((short) 1); 
		numbers.add((byte) 1);
		numbers.add(1.0f);
//		numbers.add('c'); // doesn't work
//		numbers.add(true); // doesn't work
		numbers.add((short) 'c'); // workaround
		System.out.println(numbers);
		
		for (Number n : numbers) {
			// print out the type
			System.out.println(n.getClass());
		}
		
		///////////////////////////////////////////////
		// Example 2: Autoboxing Limitations
		int a = 1;
		double b = a; // works ____ --> ____
		Integer x = 1;
//		Double y = 2; // doesn't work ____ -x-> ____
		
		///////////////////////////////////////////////
		// Example 3: Autoboxing Limitations
//		Double y = x; // doesn't work ____ -x-> _____
//		Double y = (Double) x; // doesn't work ____ -x-> ____
		Double c = 1.0; // ____ --> ____
		
		///////////////////////////////////////////////
		// Example 4: Workarounds
		Double y = (double) x; // works ____ --> ____ --> ____
		Double w = Double.valueOf(x); // works
	}
	
	/* Autoboxing limitations
	 * 
	 * int -> Integer
	 * Integer -> int
	 * 
	 * double -> Double
	 * Double -> double
	 * 
	 * NOT:
	 * int -> Double
	 * Integer -> Double
	 * 
	 * (likewise for byte -> short -> char -> long)
	 * 
	 */

}
