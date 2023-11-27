package com.skillstorm.enhanced.forloops;

import java.util.Arrays;

public class LectureExamplesForEachLoops {
	
	public static void main(String[] args) {
		// Updating an element in an array you need the index
		// not just a copy
		int[] nums = { 1, 2, 3 };
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 3;
			System.out.println(nums[i]);
			
		}
		System.out.println(Arrays.toString(nums));
		
		// Accessing multiple elements at once 
		int[] nums2 = { 1, 2, 3 };
//		for (int i = 0; i < nums2.length; i++) { // causes bug bc we are accessing index + 1
		for (int i = 0; i < nums2.length - 1; i++) { // causes bug bc we are accessing index + 1
			System.out.println(nums2[i] 
					+ " comes before " + nums2[i + 1]);
		}
		System.out.println(Arrays.toString(nums2));
		print(nums);
	}
	
	public static void print(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

}
