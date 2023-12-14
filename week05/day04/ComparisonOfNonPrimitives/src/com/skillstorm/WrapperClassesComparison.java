package com.skillstorm;

// For an in-depth explanation see:
// https://dzone.com/articles/java-integer-cache-why-integervalueof127-integerva

public class WrapperClassesComparison {

	public static void main(String[] args) {
		// Integer values -128 to 127 inclusive are cached by the compiler
		Integer x  = 100; // Compiler converts to Integer.valueOf(100);
		Integer y = new Integer(100);
		Integer z = Integer.valueOf(100);
		System.out.println("hello".equals("hello"));
		
		System.out.printf("x == y is %b%n", x == y);
		System.out.printf("x == z is %b%n", x == z);
		System.out.printf("x + 0 == y + 0 is %b%n", x + 0 == y + 0);
	}
}
