package com.skillstorm;

public class GroupWork {

	/**
	 * Copy range from start index (inclusive) to end index (exclusive)
	 * 
	 * @param numbers The integer array to copy elements from.
	 * @param start   The index to start copying elements from.
	 * @param end     The index to stop copying elements at (this element is
	 *                excluded)
	 * @return A new array with all the elements between the start and end index If
	 *         end > length what should we do? returns null If start >= end what
	 *         should we do? returns null
	 * @author Team Cave Bear - Rod, Shawn, Steven
	 */
	public static int[] copyRange(int[] numbers, int start, int end) {
		int[] copy = new int[end - start];
		if (start < 0 || end >= numbers.length || start > end) {
			return null;
		}
		for (int i = start; i < end; i++) {
			copy[i - start] = numbers[i];
		}
		return copy;
	}

	/**
	 * Append returns a new array with all the elements of arr1 and all the elements of arr2
	 * @param arr1 An int[] array
	 * @param arr2 An int[] array
	 * @return A new array with all the elements of arr1 and all the elements of arr2
	 *         If arr1 is null or empty, returns arr2
	 *         If arr2 is null or empty, returns arr1
	 * @author Team Dire Worlf - Josh, Tim, Matt
	 */
	public static int[] append(int[] arr1, int[] arr2) {
		if (arr1 == null || arr1.length == 0)
			return arr2;
		if (arr2 == null || arr2.length == 0)
			return arr1;

		int[] result = new int[arr1.length + arr2.length];

		int counter = 0;
		while (counter < result.length) {
			if (counter < arr1.length) {
				result[counter] = arr1[counter];
			} else {
				result[counter] = arr2[counter - arr1.length];
			}
			counter++;
		}

		return result;
	}

	/**
	 * Write a method that returns true if all the values in a number array are
	 * even.
	 * 
	 * @author Team Saber Tooth Tiger - Sam, Saugat, Sean, Carlos
	 * @param nums
	 * @return
	 */
	public static boolean allEven(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (!(nums[i] % 2 == 0))
				return false;
		}
		return true;
	}

	/**
	 * Rotate a String moving the first n letters to the end of the string
	 * 
	 * @author Team Mammoth - Hunter, Nick, Nasser
	 */
	public static String rotate(String str, int rotation) {
		String result = "";

		int i = 0;
		while ((rotation + i) < str.length()) {
			result += str.charAt(rotation + i);
			i++;
		}

		while ((rotation + i - str.length()) < rotation) {
			result += str.charAt(rotation + i - str.length());
			i++;
		}

		return result;
	}

	/**
	 * Rotate a String character by character
	 * 
	 * @author Team Mammoth - Hunter, Nick, Nasser
	 */
	public static String rotate2(String str, int rotation) {
		String result = "";
		char[] charArray = str.toCharArray();
		int i = 0;
		while (i < charArray.length) {
			int rotatedChar = charArray[i] + rotation;
			result += (char) rotatedChar;
			i++;
		}
		return result;
	}

}
