package com.skillstorm;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		int count = 0;
		// Use do-while instead of while
		// when you want the code block to always run at least once
		do {
			System.out.println(count);
			count++;
		} while (count > 10);
		
		Scanner scanner = new Scanner(System.in);
		// Prompt the user
		int x = 0;
		do {
			System.out.print("Enter a number  between 1 and 10 (inclusive): ");
			x = scanner.nextInt(); 
		} while (!valid(x));
		System.out.println("Thank you for entering the number " + x);
	}
	
	public static boolean valid(int x) {
		return x >= 1 && x <= 10; // returns true if  the number is between 1 and 10
	}

}
