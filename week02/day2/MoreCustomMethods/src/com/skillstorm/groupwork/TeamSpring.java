package com.skillstorm.groupwork;

import java.util.Scanner;

/**
 * Code from the group assignment
 * https://stormsurge.skillstorm.com/courses/3835/assignments/33592
 * 
 * Code not available. 
 * @author Carlos, Shawn, Nick
 */
public class TeamSpring {

	public static void main(String[] args) {
		System.out.println("Welcome to the program for deciding if you");
		System.out.println("Should Play Tennis Today\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's look at the weather conditions.\n");

		if (isWeatherGood(scanner)) {
			System.out.println("Yes! Today is a great day to play tennis.");
		} else {
			System.out.println("No, today is not good tennis weather. Maybe go bowling.");
		}

		scanner.close();

	}

	// Code not available
	 public static boolean isWeatherGood(Scanner scanner) {
         // TODO Your code here
         return false;
     }

}
