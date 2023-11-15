package com.skillstorm.modulus;

public class ModuloVsRemainder {
	
	public static void main(String[] args) {
		// Clarification:
		// % - is the Remainder operator
		// 
		// For positive values you can think of this as the modulo operator.
		// 
		// For negative and positive values:
		// - Remainder operator - always takes the sign of the dividend
		//          (dividend / divisor = quotient)
		//      Example:  -3 / 2 = -1 Remainder -1
		// 
		// - Modulo operator - always takes on the sign of the divisor
		//          (dividend / divisor = quotient)
		//      Example:  -3 mod 2 = 1
		//
		// (Python % is modulo operator, Java and JavaScript % is the remainder operator)
		
		int a = -3;
		int b = 2;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a / b = " + a / b);
		System.out.println("a % b = " + a % b);
		System.out.println("a mod b = " + ((a % b) + b) % b);
		
	}

}
