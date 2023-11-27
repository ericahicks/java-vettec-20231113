package com.skillstorm.forloops;

public class LectureExamples {

	public static void main(String[] args) throws InterruptedException {
		challengeV2();
	}

	/**
	 * Prints out the numbers 10 to 100 inclusive.
	 * @throws InterruptedException 
	 * 
	 */
	public static void challenge() throws InterruptedException { // if you don't want to bother try-catching
		// YOUR CODE HERE
		for (int i = 10; i <= 100; i += 10) {
			Thread.sleep(1000); // milliseconds to pause execution before continuing
			System.out.println(i);
		}
	}
	
	// Variations
	// use < 101 instead of <=100
	// use i = 1; i <= 10; i++ with a print statement of i * 10
	public static void challengeV2() {
		for (int j = 1; (j * 10) < 101;  j++) {
			System.out.println(j * 10);
		}
	}

	public static void example1() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println("Done.");
	}

	public static void example2() {
		System.out.println("Start");
		for (;;)
			;
//		System.out.println("End"); // Unreachable code
	}

	public static void example3() {
		int x;
		for (x = 0; x < 3; x++) {
			System.out.println(x);
		}
		System.out.println("x is now " + x);
	}

	public static void example4() {
		int y = 3;
		for (; y > 0; y--) {
			System.out.println(y);
		}
		System.out.println("y is now " + y);
	}

	public static void example5() {
		int i; // This is uninitialized (will not hold any value yet)
		for (i = 0; i < 0; i++)
			; // Sneaky semicolon ends loop body
		{ // Will these brackets create an issue?
			System.out.println("i=" + i); 
		}
		int y = 1;
		{ // I can create an inner block of code whenever I want
			int z = 2;
		}
//		System.out.println(z); // Does not exist outside the block it is defined in
	}

	public static void example6() {
		for (int x = 0, y = 10;  x < y; x++, y--) { 
		    System.out.println("x=" + x + ", y=" + y); 
		}
//		System.out.println("x=" + x + ", y=" + y); // no local variables x or y
		
	}

}
