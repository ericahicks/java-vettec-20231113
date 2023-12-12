package com.skillstorm.lecture;

public class NumberAutoboxing {
	
	public static void main(String[] args) {
		Integer x  = 100;
		Integer y = x;
		x = x + 1;

		System.out.println("x = " + x ); // 100
		System.out.println("y = " + y ); // 101
	}

}
