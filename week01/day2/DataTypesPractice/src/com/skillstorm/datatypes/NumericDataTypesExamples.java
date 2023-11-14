package com.skillstorm.datatypes;

public class NumericDataTypesExamples {
	
	public static void main(String[] args) {
		////////////////////////////////////////////////////
		// Example 1: whole numbers
		// - byte
		// - short
		// - int
		// - long
		int x = 10;
		x = 2_000_000_000; 
//		x = 2000000000000; // invalid too large out of range an int can hold
		long y = 2000000000000L; // valid long value 
		
		//////////////////////////////////////////////////////
		// Example 2:
//		 short s = 60_000; // will this work?
		short largestShort = Short.MAX_VALUE;
		System.out.println("Largest short value is " + largestShort);
		
		// Example 3: 
//		byte b = 128; // invalid the max value of a byte is 127
		byte bb = -128; 
		byte largestByte = Byte.MAX_VALUE;
		System.out.println("Largest byte value is " + largestByte);
		System.out.println("Smallest byte value is " + Byte.MIN_VALUE);
		
//		Byte bbb = 10; // valid but don't use 
		
		
	}
	

}
