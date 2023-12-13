package com.skillstorm;

public class LoopLabels {
	/**
	 * Loop label conventions
	 * - all lowercase of camelcase
	 * - can't be a keyword
	 * - should not be in quotes
	 * - can contain numbers but cant start with one
	 * 
	 */
	public static void main(String[] args) {
		int counter = 0;
		here: for (int i = 0; i < 3; i++) {
			System.out.println("in outer loop");
			for (int j = 0; j < 2; j++) {
				System.out.println("in inner loop");
				if (j == 1) {
					break here;
				}
				counter++;
			}
		}
		System.out.println(counter);
	}

}
