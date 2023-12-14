package com.skillstorm.lecture;

import java.util.ArrayList;

public class ArrayListIntegersAccessExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		for (Integer i : numbers) {
			System.out.println(i.getClass());
		}
	}

}
