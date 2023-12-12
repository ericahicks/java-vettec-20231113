package com.skillstorm.lecture;

public class StringToInteger {
	
	public static void main(String[] args) {
//		System.out.println(Integer.valueOf("1"));
		System.out.println(Integer.valueOf("1.0")); // number format exception
		System.out.println(Integer.valueOf("101"));
		System.out.println(Integer.valueOf("101", 2)); // radix 2 = binary
		//                                2^2 * 1 + 2^1 * 0 + 2^0 * 1
		//                                 4  * 1 +   2 * 0 +   1 * 1
		//                                    4   +     0   +     1      
		System.out.println(Integer.valueOf("101", 8)); // radix 8 = octal
		System.out.println(Integer.valueOf("101", 16)); // radix 16 = hexidecimal
	}

}
