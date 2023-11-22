package com.skillstorm;

public class AccessingArrayElements {
	
	public static void main(String[] args) {
		// Accessing all the elements of an array one by one
		String names[] = { "Bob", "Sue", "Mac" };
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		int i = 0; // i is the exception to the rule "don't use single letter variables"
		System.out.println(names[i++]); // i++ returns the old value 0 and then sets i to 1
		System.out.println(names[i++]); // i++ returns the old value 1 and then sets i to 2
		System.out.println(names[i++]); // i++ returns the old value 2 and then sets i to 3
//		System.out.println(names[i++]); // i++ returns the old value 3 and then sets i to 4
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	}

}
