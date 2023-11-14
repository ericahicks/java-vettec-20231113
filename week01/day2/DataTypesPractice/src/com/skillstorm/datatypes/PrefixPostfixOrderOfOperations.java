package com.skillstorm.datatypes;

public class PrefixPostfixOrderOfOperations {
	
	public static void main(String[] args) {
		// Example 1:
		int a = 1;
//		System.out.println(a++); // do I get the new or old value of a?
		System.out.println(++a);
		
		// We have to distinguish between 
		int x = 10;
		x += 10 * x++;
		// breaking this down
		// x = x + 10 * x = 110
		// x = 10 + 10 * 10
		// 
		System.out.println(x);
	}

}
