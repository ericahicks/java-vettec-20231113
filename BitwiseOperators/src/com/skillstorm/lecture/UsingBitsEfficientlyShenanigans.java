package com.skillstorm.lecture;

import static java.lang.Math.pow;

import java.util.Arrays;

public class UsingBitsEfficientlyShenanigans {
	
	// Write a method where given a byte, figure out how many of the assigments 
	// the student has completed
	public static int countCompletedAssignments(byte b) {
		return Integer.bitCount(b);
	}
	
	public static void main(String[] args) {
		// Store grades for 8 assignments in an int array
		// 0 = incomplete
		// 1 = complete
		int[] grades = new int[8];
		// Sam's grades 
		grades[0] = 1;
		grades[1] = 1;
		grades[2] = 1;
		grades[3] = 0;
		grades[4] = 0;
		grades[5] = 1;
		grades[6] = 1;
		grades[7] = 1; 
		System.out.println(Arrays.toString(grades));
		// How many bits in memory does this take?
		// 32 bits per number x 8 numbers = 256 bits
		
		// What if instead we stored each assignment as a 1 or 0 bit in a byte?
		byte samsGrades = (byte) (1 * pow(2, 0) // 00000001
								+ 1 * pow(2, 1) // 00000010
								+ 1 * pow(2, 2) // 00000100
								+ 0 * pow(2, 3) // 00000000
								+ 0 * pow(2, 4) // 00000000
								+ 1 * pow(2, 5) // 00100000
								+ 1 * pow(2, 6) // 01000000
								+ 1 * pow(2, 7) // 10000000
								 );           // = 11100111
		System.out.println(countCompletedAssignments(samsGrades));
		System.out.println(Integer.toBinaryString(samsGrades));
		// How many bits in memory does this take?
		// 8 bits!
		// Should you do this? No! 
		// Unless you are programming the apollo computer that only had 2048 words aka 4096 bytes
		byte dansGrades = Integer.valueOf("11100111", 2).byteValue();
		// Note, while the end result for storing dan's grades is the same, this is not memory efficient
		//  - Java creates a String in memory from the String literal "111001110" which takes
		//                                                             16 bits per character
		// - Java creates an Integer object in memory that takes who knows how many bits
		// - Finally Java creates the 8-bit byte value
		byte josGrades = 1   // 00000001
				       | 2   // 00000010
				       | 4   // 00000100
				       | 8   // 00001000
				       | 16  // 00010000
				       | 32  // 00100000
				       | 64  // 01000000
				       | -128 // 10000000
				       ;
		
	}
}
