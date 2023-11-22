package com.skillstorm;

import java.util.Arrays;

public class ArraysAsParameters {
	////////////////////////////////////////
	// Assignment Wed Nov 22 - Part 2
	public static void main(String[] args) {
		int[] test1 = {1, 2, 3};
		int[] test2 = {1};
		int[] test3 = {};
		int[] test4 = null;
		
		System.out.println("Testing getLastElement({1,2,3) gives: " + getLastElement(test1));
		System.out.println("Testing getLastElement({1,2,3) gives: " + getLastElement(test2));
		System.out.println("Testing getLastElement({1,2,3) gives: " + getLastElement(test3));
		System.out.println("Testing getLastElement({1,2,3) gives: " + getLastElement(test4));
	}
	
	// Write a method that takes in an array and
	// returns the last element of an array
	public static int getLastElement(int[] arr) {
		// TODO your code here
		return 0;
	}

}
