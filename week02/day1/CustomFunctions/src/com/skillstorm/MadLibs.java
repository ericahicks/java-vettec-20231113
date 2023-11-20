package com.skillstorm;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for words
		System.out.print("Enter an occupation: ");
		String occupation = scanner.nextLine();

		System.out.print("Enter a type of weapon: ");
		String weapon = scanner.nextLine();

		System.out.print("Enter an adjective: ");
		String descriptor = scanner.nextLine();

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		scanner.nextLine(); // clear the \r character from the scanner input

		System.out.print("Enter a noun: ");
		String noun = scanner.nextLine();

		// Print out the story
		System.out.println("A long time ago there lived a " 
				+ occupation + " who met a monk." + "The monk gave the "
				+ occupation + " a " + descriptor + " " + weapon + "\nand told the " + occupation
				+ " about a bigger world. " + "He met a " + number + " foot tall wookie, " 
				+ "a princess and a scoundrel. \nTogether the four of them defeated the evil " 
				+ noun + " and all was right in the world. The End.");
		scanner.close();
	}
	
	// Custom helper method to prompt the user

}
