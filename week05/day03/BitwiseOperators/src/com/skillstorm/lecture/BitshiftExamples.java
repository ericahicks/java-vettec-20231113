package com.skillstorm.lecture;

import static com.skillstorm.lecture.BitwiseEquationsPrinted.printBinaryInt;

public class BitshiftExamples {
	
	public static void main(String[] args) {
		example1();

		//   -1 = 11111111111111111111111111111111
		System.out.print("Bitshift -1 >> 4  = ");
		printBinaryInt(-1 >> 4); // 00001111111111111111111111111111 is not the result. why?
		
		//  MAX = 01111111111111111111111111111111
		System.out.print("Bitshift MAX >> 4  = ");
		printBinaryInt(Integer.MAX_VALUE >> 4); // 00000111111111111111111111111111
		System.out.println();
		// More interesting number
		// 0111111111111111111100001110110
//		"0111111111111111111100001110110" // how can I turn this into a number???
		int num = Integer.valueOf("00111111111111111111100001110110", 2);
		printBinaryInt(num);
		System.out.print("Bitshift num >> 4 = ");
		printBinaryInt(num >> 0b0000100);
		System.out.println();

		System.out.print("Bitshift -1 >>> 4 = ");
		printBinaryInt(-1 >>> 4);
		System.out.println(-1 >>> 4);
//		
//
//		System.out.print("Bitshift -1 << 4  = ");
//		printBinaryInt(-1 << 4);
//		
//		System.out.println();
//		
//		final int MAX = Integer.MAX_VALUE;
//		System.out.print("Bitshift MAX >> 4  = ");
//		printBinaryInt(MAX >> 4);
//
//		System.out.print("Bitshift MAX >>> 4 = ");
//		printBinaryInt(MAX >>> 4);
//		
//
//		System.out.print("Bitshift MAX << 4  = ");
//		printBinaryInt(MAX << 4);
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
