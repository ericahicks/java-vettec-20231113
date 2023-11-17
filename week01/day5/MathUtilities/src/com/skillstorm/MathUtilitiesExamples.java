package com.skillstorm;

public class MathUtilitiesExamples {
	
	public static void main(String[] args) {
		System.out.println(">> Find the absolute value of a number");
		int x = -3;
		int answer = Math.abs(0);
		
		System.out.println("Math.abs(-3)=" + answer);
		
		// Math.random() Examples: 
		System.out.println(Math.random()); // 0.0 to 1.0 (never actually 1.0)
		System.out.println(10 * Math.random()); // 0.0 to 10.0 (never actually 10.0)
		System.out.println((int) (10 * Math.random())); // 0 to 9 (bc 9.999999 is still 9)
		System.out.println((int) (10 * Math.random()) + 1); // 1 to 10
		//                      (range * Math.random()) + offset
		
		System.out.println("---------------------------------");
		// To get a number between 1 and 6 change the range
		System.out.println((int) (6 * Math.random()) + 1);
		
		
		// Coin toss: Generate a number between 1 and 2 inclusive
		System.out.println((int) (Math.random() * 2) + 1);
		
	}

}
