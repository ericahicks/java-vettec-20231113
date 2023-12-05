package com.skillstorm;

public class FinalExamples {
	
	// I can mark any variable as final during declaration
	// in any scope
	// - class
	// - instance
	// - method
	// - block scope
	
	final int x = 1;
	final static int y = 1;
	static final int z = 1;
	
	public static void main(String[] args) {
		doStuff2(2);
	}
	
	void doStuff() {
		final int z = 3;
//		z = 2;
		System.out.println("z = " + z);
	}
	
	 static int doStuff2(final int a) {
//		a * = 2;
		int b = a * 2;
		return b;
	}
	 
	 static void doStuff3(int[] nums) {
		 for (final int n : nums) { // block scope
			 System.out.println(n);
		 }
		 if (0 < 5) { // block scope
			 final int c = 3;
//			 c += 3; // cannot be redefined bc final
			 System.out.println("c is " + c);
		 }
	 }
	
}

// final on a class
final class Animal {
	
}

//class Dog extends Animal { } // This is not allowed bc final classes cannot be extended