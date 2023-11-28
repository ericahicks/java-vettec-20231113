package com.skillstorm;

public class LectureExamples {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		while (x > y) {
			System.out.println(x);
			x--;
		}
		// x = y is a assignment, not an expression?
		while ((x += y) < 10) { // condition gets re-evaluated and x is set to 2
			System.out.println("x is " + x);
			x++; // here x becomes 3
		}
//		while (2 > 10) {
			// UNREACHABLE CODE bc 2 is not > 10
//		}
//		while (x = y) { //type mismatch cannot convert from int to boolean
		while (x == y) {
			
		}
//		while ('t') { // "true" is not a boolean
		char b = 't';
		while ('t' == b) {
			
		}
//		while ("true") { // "true" is not a boolean
		while (true) {
			
		}
		// note the code won't compile if I put any more code below this infinite loop
		// because UNREACHABLE CODE is a compilation error
	}

}
