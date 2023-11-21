package com.skillstorm;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for words
		String occupation = promptUser(scanner, "occupation");

		String weapon = promptUser(scanner, "type of weapon");

		String descriptor = promptUser(scanner, "adjective");

		String number = promptUser(scanner, "number");

		String noun = promptUser(scanner, "noun");

		// Print out the story
		System.out.println("A long time ago there lived a " + occupation + " who met a monk." + "The monk gave the "
				+ occupation + " a " + descriptor + " " + weapon + "\nand told the " + occupation
				+ " about a bigger world. " + "He met a " + number + " foot tall wookie, "
				+ "a princess and a scoundrel. \nTogether the four of them defeated the evil " + noun
				+ " and all was right in the world. The End.");
		scanner.close();
	}

	// Custom helper method to prompt the user
	public static String promptUser(Scanner scanner, String wordType) {
		System.out.print("Enter a " + wordType + ":");
		String response = scanner.nextLine();
		return response;
	}

}
