package com.skillstorm.lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class EnthuwareReview {

	public static void test1Problem32() {
		char i;
		LOOP: for (i = 0; i < 5; i++) {
				switch (i++) { // 0 // 2 // 4
				case '0': // 48 != 0
					System.out.println("A");
					// no break, falls through
				case 1:
					System.out.println("B");
					break LOOP; // breaks loop
				case 2:
					System.out.println("C"); // prints
					break; // breaks case
				case 3:
					System.out.println("D");
					break; // breaks case
				case 4:
					System.out.println("E"); // prints
					// no break, so falls through
				case 'E': // 69
					System.out.println("F"); // prints
				}
		}
	}

	public static void test1Problem38() {

	}

	public static void tes1Problem7() {
		Object o = null;
		ArrayList c = new ArrayList();// ArrayList of type Object
		c.add("apples"); // String
		c.add(1); // Integer
		c.add(new Scanner(System.in)); // Scanner
		int[] ia = { 1, 2, 3 }; // valid array
	}

	public static void test1Problem1() {
		try {
			m1();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("1");
			throw new NullPointerException(); // IS NOT CAUGHT BY FOLLOWING CATCH
		} catch (NullPointerException e) {
			System.out.println("2"); // DOES NOT RUN
			return;
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("END");
	}

	// IndexOutOfBoundsException is a subclass of RuntimeException.
	static void m1() {
		System.out.println("m1 Starts");
		throw new IndexOutOfBoundsException("Big Bang ");
	}

}
