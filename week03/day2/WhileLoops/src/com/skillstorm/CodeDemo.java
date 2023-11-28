package com.skillstorm;

import java.util.Arrays;

public class CodeDemo {
	
	public static void main(String[] args) {
		int[] original = {2, 3, 4};
		int[] copy = copy(original);
		System.out.println("Original is " + Arrays.toString(original));
		System.out.println("Copy is " + Arrays.toString(copy));
		// change original shouldn't change the copy
		System.out.println(">>> Changing the first element of original to 1");
		original[0] = 1;
		System.out.println("Original is now " + Arrays.toString(original));
		System.out.println("Copy is still " + Arrays.toString(copy));
		
		int[] test1 = {0, 1, 2, 3};
		int[] result1 = copyRange(test1, 1, 3); // expecting 1 , 2 
		System.out.println();
		System.out.println("Test1 is " + Arrays.toString(test1));
		System.out.println(">>> Copying range from start index 1 to end index 3 (exclusive)");
		System.out.println("Result1 is " + Arrays.toString(result1));
		
		int[] test2 = {4, 5, 6}; 
		int[] result2 = append(test1, test2);
		System.out.println("Test2 is " + Arrays.toString(test2));
		System.out.println(">>> Appending the arrays test1 and test2");
		System.out.println("Result2 is " + Arrays.toString(result2));
		
		System.out.println();
		System.out.printf("Does the array %s contain negatives? %s%n%n", Arrays.toString(new int[] {1, 2, 3}), containsNegatives(new int[] {1, 2, 3}));
		System.out.printf("Does the array %s contain negatives? %s%n%n", Arrays.toString(new int[] {1, 2, -3}), containsNegatives(new int[] {1, 2, -3}));
	
		System.out.printf("Does the array %s contain all evens? %s%n%n", Arrays.toString(new int[] {1, 2, 3}), allEven(new int[] {1, 2, 3}));
		System.out.printf("Does the array %s contain all evens? %s%n%n", Arrays.toString(new int[] {0, 2, 4}), allEven(new int[] {0, 2, 4}));
	
		String msg = "Hello";
		String encoded = rotate(msg, 3);
		String decoded = rotate(encoded, -3);
		System.out.printf("The message %s encoded is %s. Decoded it is %s again.", msg, encoded, decoded);
	}
	
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
	 * @author Erica
	 */
	public static int[] copyRange(int[] numbers, int start, int end) {
		// Make sure the array is not null
		if (numbers == null)
			return null;
		// Make sure end is valid
		if (end > numbers.length)
			end = numbers.length;
		// Find new length by counting how many elements from start index to end index
		int length = end - start;
		if (length <= 0)
			return new int[]{};
		// Else copy over the elements
		int[] answer = new int[length];
		int i = 0;
		while (i < length) {
			// When i is 0, grab the numbers[start] element
			// When i is 1, grab the numbers[start + 1] element
			// etc.
			answer[i] = numbers[start + i];
			i++;
		}
		return answer;
	}
	
	/**
	 * Append returns a new array with all the elements of arr1 and all the elements of arr2
	 * @author Erica
	 */
	public static int[] append(int[] arr1, int[] arr2) {
		if (arr1 == null || arr1.length == 0)
			return copy(arr2);
		if (arr2 == null || arr2.length == 0)
			return copy(arr1);
		
		// Calculate the length of the new array
		int length = arr1.length + arr2.length;
		int[] answer = new int[length];
		
		// Copy over the elements from arr1
		int i = 0;
		while (i < arr1.length) {
			answer[i] = arr1[i];
			i++;
		}
		// Copy over the elements from arr2
		i = 0;
		while (i < arr2.length) {
			answer[i + arr1.length] = arr2[i];
			i++;
		}
		return answer;
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
	 * @author Erica
	 */
	public static boolean allEven(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] % 2 != 0)
				return false;
		}
		return true;
	}
	
	/**
	 * Write a method that takes in a String 
	 * and encodes it by rotating all the letters by n characters.
	 * @author Erica
	 */
	public static String rotate(String str, int rotation) {
		String result = "";
		int i = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			result += (char) (c + rotation);
			i++;
		}
		return result;
	}
	
	// Helper method
	

}
