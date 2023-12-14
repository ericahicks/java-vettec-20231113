package com.skillstorm.lecture;

public class BitwiseEquationsPrinted {

	public static void main(String[] args) {
		example1();
//		x & ~x;
		int x = 4;
		int y = ~x;
		// 100
		// 011
		// 000
	}


	/////////////////////////////////////////////////////////////////////////////
	// Example 1: Print binary equations using | and ^
	/////////////////////////////////////////////////////////////////////////////
	public static void example1() {
		// Example 1: Printing binary values
		System.out.println("zero, one, negative one, smallest value, largest value");
		System.out.print("   0 = ");
		printBinaryByte((byte) 0);
		System.out.print("   1 = ");
		printBinaryByte((byte) 1);
		System.out.print("  -1 = ");
		printBinaryByte((byte) -1);
		System.out.print("-128 = ");
		printBinaryByte((byte) -128);
		System.out.print(" 127 = ");
		printBinaryByte((byte) 127);
		System.out.println();
	}


	/////////////////////////////////////////////////////////////////////////////
	// Example 2: Print binary equations using | and ^
	/////////////////////////////////////////////////////////////////////////////
	public static void example2() {
		// Example 2: Print binary equations using &
		int x = 24;
		int y = -1;
		int z = x & y;
		System.out.println("24 & -1 = 24");
		System.out.print("x=");
		printBinaryInt(x);
		System.out.print("y=");
		printBinaryInt(y);
		System.out.print("& ");
		printDashes(32);
		System.out.print("  ");
		printBinaryInt(z);
		System.out.println();

		y = 0;
		z = x & y;
		System.out.println("24 & 0 = 0");
		System.out.print("x=");
		printBinaryInt(x);
		System.out.print("y=");
		printBinaryInt(y);
		System.out.print("& ");
		printDashes(32);
		System.out.print("  ");
		printBinaryInt(z);
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////
	// Example 3: Print binary equations using | and ^
	/////////////////////////////////////////////////////////////////////////////
	public static void example3() {
		int x = 1;
		int y = 3;
		int z = x | y;

		System.out.println("1 | 3 = 3");
		System.out.print("x=");
		printBinaryInt(x);
		System.out.print("y=");
		printBinaryInt(y);
		System.out.print("| ");
		printDashes(32);
		System.out.print("  ");
		printBinaryInt(z);

		System.out.println();

		z = x ^ y;
		System.out.println("1 ^ 3 = 2");
		System.out.print("x=");
		printBinaryInt(x);
		System.out.print("y=");
		printBinaryInt(y);
		System.out.print("^ ");
		printDashes(32);
		System.out.print("  ");
		printBinaryInt(z);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	// Helper methods
	//////////////////////////////////////////////////////////////////////////////////////

	public static void printBinaryInt(int x) {
		String binary = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
		System.out.println(binary);
	}

	public static void printBinaryByte(byte x) {
		String binary = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0').substring(24);
		System.out.println(binary);
	}

	public static void printDashes(int x) {
		String dashes = "";
		for (int i = 0; i < x; i++) {
			dashes += "-";
		}
		System.out.println(dashes);
	}

}
