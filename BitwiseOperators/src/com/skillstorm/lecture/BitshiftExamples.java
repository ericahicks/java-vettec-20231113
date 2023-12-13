package com.skillstorm.lecture;

import static com.skillstorm.lecture.BitwiseEquationsPrinted.printBinaryInt;

public class BitshiftExamples {
	
	public static void main(String[] args) {
		example1();

		System.out.print("Bitshift -1 >> 4  = ");
		printBinaryInt(-1 >> 4);

		System.out.print("Bitshift -1 >>> 4 = ");
		printBinaryInt(-1 >>> 4);
		

		System.out.print("Bitshift -1 << 4  = ");
		printBinaryInt(-1 << 4);
		
		System.out.println();
		
		final int MAX = Integer.MAX_VALUE;
		System.out.print("Bitshift MAX >> 4  = ");
		printBinaryInt(MAX >> 4);

		System.out.print("Bitshift MAX >>> 4 = ");
		printBinaryInt(MAX >>> 4);
		

		System.out.print("Bitshift MAX << 4  = ");
		printBinaryInt(MAX << 4);
	}
	/////////////////////////////////////////////////////////////////////////////
	// Example 1: Print binary equations using | and ^
	/////////////////////////////////////////////////////////////////////////////
	public static void example1() {
		// Example 1: Printing binary values
		System.out.println("zero, one, negative one, smallest value, largest value");
		System.out.print("   0 = ");
		printBinaryInt(0);
		System.out.print("   1 = ");
		printBinaryInt(1);
		System.out.print("  -1 = ");
		printBinaryInt(-1);
		System.out.print(" MIN = ");
		printBinaryInt(Integer.MIN_VALUE);
		System.out.print(" MAX = ");
		printBinaryInt(Integer.MAX_VALUE);
		System.out.println();
	}
}
