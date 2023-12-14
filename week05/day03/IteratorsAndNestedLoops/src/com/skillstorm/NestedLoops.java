package com.skillstorm;

public class NestedLoops {
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 3; i > 0; i--) {
			for (int j = 2; j > 0; j--) {
				System.out.println("i = " + i + ", j = " + j);
				count += 1;
			}
		}
		System.out.println(count);
	}

}
