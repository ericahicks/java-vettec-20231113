package com.skillstorm;

public class ArrayExamples {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 6, 8 };
		int n = 0; // loop counter
		while (n < nums.length) {
			System.out.println(nums[n]); // using the loop counter to access the nth element
			n++; // increment the counter
		}
		// To go backwasds through the array
		n = nums.length - 1; // 2; // the index of the element 8
		while (n >= 0) {
			if (nums[n] % 2 != 0) {
				n--;
				continue;
			}
			System.out.println(nums[n]);
			n--;
		}

		String[] birds = { "Duck", "Duck", "Duck", "Duck", "Goose", "Duck", "Duck", "Duck" };
		int counter = 0;
		while (counter < birds.length) {
			// without using break, stop at goose
			if (birds[counter].toLowerCase().equals("goose")) {
				counter = birds.length; // 99999 may not cause it to break we dunno how many birds there are
			} else {
				System.out.println(birds[counter]);
				counter++;
			}

		}
	}
}