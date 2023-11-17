package com.skillstorm;

import java.util.Scanner;

// Shortcut to get your code blocks aligned correctly: CTRL-SHIFT-F
public class IfElseExamples {

	public static void main(String[] args) {
		// Example 1: Prompt your user for yes or no
		Scanner scanner = new Scanner(System.in);
		System.out.print("Are you over 21? (yes or no): ");
		String response = scanner.nextLine().toLowerCase(); // Or use .equalsIgnorCase()
		if (response.equals("yes")) { // Good style is to always use brackets
			System.out.println("Here's your drink!");
			System.out.println("Enjoy!"); // You cannot have a second line of code if there are no { }
		} else {
			System.out.println("sorry");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//////////////////////////////////////
		// Example 2: Nested Logic
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // clear the \n from the buffer just in case
		System.out.println("Do you live in the US?");
		String isInUnitedStates = scanner.nextLine();
		boolean humid;
		boolean isHumid; // naming convention used for booleans sometimes
		
		// Goal:
		// Check if they are not in the us and they are over 18
		// then they can drink
		if (!isInUnitedStates.toLowerCase().contains("y")) { // they can enter yes or y or YES etc.
			if (age >= 18) {
				System.out.println("Here is your drink!");
			} else {
				System.out.println("Sorry, come back later. Much later.");
			}
		} else { // at this point I know isInUnitedStates.toLowerCase().contains("y") is true and don't need to check
			if (age >= 21) {
				System.out.println("Have a drink on me!");
			} else {
				System.out.println("Sorry.");
			}
		}
		// then they can drink
		
		
		
		// Example 2 Version 2:
		// A better order for checking is:
		if (age <= 18) {
			System.out.println("Sorry.");
		} else if (!isInUnitedStates.toLowerCase().contains("y")) { // I know they are 18, but now what?
			System.out.println("Here's your drink");
		} else if (age >= 21) { // I know they are over 18 and they are in the US
			System.out.println("Here's your drink on me!");
		} else { // they are in the US but not 21 yet
			System.out.println("Sorry.");
		}
		
		
		
		
		
		// Example 2 Version 3: Combining Logic
		// This logic is done in one line which is awesome
		// but it's hard to read, so you would NEED to put a comment to tell future you what it is doing
		
		if ((age >= 21) // && isInUnitedStates.toLowerCase().contains("y") don't need to check bc everywhere they are old enough
				||  (age >= 18 && !isInUnitedStates.toLowerCase().contains("y"))) {
			System.out.println("Here's your drink!");
		} else {
			System.out.println("Sorry.");
		}

		scanner.close();
	}

}
