package com.skillstorm.strings;

public class StringFormatExamples {
	
	public static void main(String[] args) {
		// I'm at the grocery store and they have cookies on sale 1.99 for 5
		// To look at the cost of one cookie
		// I want to see the price 
		// but format it nicely
		double costForOneOfFiveCookies = 1.99 / 5;
		String formattedString = String.format("One cookie costs $%10.2f topay!", costForOneOfFiveCookies);
		System.out.println(formattedString);
		
		/*
		 * The formatters to know:
		 * %f for floating point (double and float types)
		 * %s for strings 
		 * %d for whole numbers (int, long, short, byte)
		 * 
		 * To format it further
		 * %10f means a width of 10
		 * %.2f means 2 digits after the decimal
		 * 
		 */
		
		// NOTE: String.format("....", arg) works the same as System.out.format("....", arg)
		//       The difference is String.format() returns a String 
		//                    and System.out.format() prints it out
		System.out.format("%10s\n", "Students");
		System.out.println("-------------");
		String name = "Rod";
		System.out.format("%10s%n", name);
		name = "Josh";
		System.out.format("%10s%n", name);
		name = "Timothy";
		System.out.format("%10s%n", name);
		
		// Example 2: Printing out the binary of an int with width 32 padded with 0s
		System.out.println("Binary version of the int 1000");
		String binaryString = Integer.toBinaryString(1000);
		System.out.println(binaryString);
		
		System.out.println("\nUse a formatter to set the width to 32:");
		String formattedBinaryString = String.format("%32s", binaryString);
		System.out.println(formattedBinaryString);
		
		System.out.println("\nFill the whitespace with 0s");
		String zeroPaddedBinaryString = formattedBinaryString.replace(" ", "0");
		System.out.println(zeroPaddedBinaryString);
		
		byte b = (byte) 1000;
		System.out.println("\nBinary version of the int 1000 narrow casted to a byte");
		String byteBinaryString = Integer.toBinaryString(b);
		System.out.println(byteBinaryString);
		
		System.out.println("\nConvert binary string to number using Integer.parseInt(str,radix)");
//		System.out.println(Byte.valueOf("10000000", 2)); // Bug is Byte.valueOf("10000000", 2) gives error out of range
		System.out.println(Byte.valueOf("-10000000", 2)); // Bug is Byte.valueOf("10000000", 2) gives error out of range
		
		System.out.println("\nUse substring to get the 8 right-most bits");
		int length = byteBinaryString.length();
		String leftMost8Bits = byteBinaryString.substring(length - 8 - 1);
		System.out.println(leftMost8Bits);
		
	}
	

}
