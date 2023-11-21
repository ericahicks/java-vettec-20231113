package com.skillstorm;

import java.util.Arrays;

public class CreatingArraysExamples {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		System.out.format("Printing out the value in an array variable: %s%n",numbers);
		System.out.format("Printing out an array converted to a String: %s", Arrays.toString(numbers));
	}

}
