package com.skillstorm.datatypes;

public class OrderOfOperations {
	
	public static void main(String[] args) {
		
		// Java does use an order of operations to 
		// PEMDAS 
		// P parenthesis
		// E exponents
		// MD mutliplcation and division
		// AS addition and subtraction
		
		// For the full list of the order of operations see:
		//  https://introcs.cs.princeton.edu/java/11precedence/
		
		// Operators to know 
		// + - * / 
		// % is the modulus aka the remainder
		int result = 3 % 2; // 3 / 2 = 1 Remainder 1 = 1
		result = 2 % 3;
		result = 20 % 12; // = 8
		result = 13 % 1; // 0
		result = 1112 % 2; // = 1
//		System.out.println(result);
		
		// Assignment operators (assignment happens last)
		// +=   -=
		// *=   /=   %=
		int a = 10;
		a = a + 1;
		a += 1;
		a += 2;
		a += 10;
		a++; // a = a + 1; // postfix so returns the old value
		++a; // a = a + 1; prefix so returns the new value
		
		
		int b = 10;
		b = b - 1;
		b -= 1;
		b -= 2;
		b -= 10;
		b--; // b = b + 1;
		
		// String concatenation with pemdas
//		System.out.println("1" + 1 + 1); // 111
		System.out.println("1" + (1 + 1));
		
//		System.out.println("1" + 1 - 1); // invalid
		System.out.println("1" + (1 - 1));
		
		System.out.println("1" + 2 * 3); // 16
		
	}

}
