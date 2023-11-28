package com.skillstorm;

public class CodeDemo {
	
	/**
	 * Copy All returns a new array with all the elements from the original array
	 * copied over. Not using the Arrays utility class's copy method!
	 * @author Erica
	 */
	public static int[] copy(int[] numbers) {
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		return copy;
	}
	
	/**
	 * Copy range from start index (inclusive) to end index (exclusive)
	 * @return A new array with all the elements between the start and end index
	 *         If end > length what should we do? returns everything up to the end of the array and nothing beyond
	 *         If start >= end what should we do? returns an empty array
	 * @author Team
	 */
	public static int[] copyRange(int[] numbers, int start, int end) {
		int[] copy = {};
		return copy;
	}
	
	/**
	 * Append returns a new array with all the elements of arr1 and all the elements of arr2
	 * @author Team
	 */
	public static int[] append(int[] arr1, int[] arr2) {
		int[] result = {};
		return result;
	}
	
	/**
	 * Write a method that takes in a number array
	 * and returns true if the array contains negative values
	 * @author Erica
	 */
	public static boolean containsNegatives(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				return true;
		}
		return false;
	}
	
	/**
	 * Write a method that returns true if all the number are even
	 * @author Team
	 */
	public static boolean allEven(int[] nums) {
		return false;
	}
	
	/**
	 * Write a method that takes in a String 
	 * and encodes it by rotating all the letters by n characters.
	 * @author Team
	 */
	public static String rotate(String str, int rotation) {
		String result = "";
		
		return result;
	}
	
	// Helper method
	

}
