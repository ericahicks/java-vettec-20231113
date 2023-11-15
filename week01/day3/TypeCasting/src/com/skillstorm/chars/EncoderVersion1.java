package com.skillstorm.chars;

import java.util.Scanner;

public class EncoderVersion1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Encoder. Please enter a 10 letter message one letter at a time: ");
		int rotateBy = 1;
		System.out.print("> ");
		char letter1 = scanner.next().charAt(0);
		letter1 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter2 = scanner.next().charAt(0);
		letter2 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter3 = scanner.next().charAt(0);
		letter3 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter4 = scanner.next().charAt(0);
		letter4 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter5 = scanner.next().charAt(0);
		letter5 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter6 = scanner.next().charAt(0);
		letter6 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter7 = scanner.next().charAt(0);
		letter7 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter8 = scanner.next().charAt(0);
		System.out.print("> ");
		letter8 += rotateBy;
		rotateBy++;
		char letter9 = scanner.next().charAt(0);
		letter9 += rotateBy;
		rotateBy++;
		System.out.print("> ");
		char letter10 = scanner.next().charAt(0);
		letter10 += rotateBy;
		rotateBy++;
		
		scanner.close();
		System.out.println("\nThe encoded message is: " 
				+ letter1
				+ letter2
				+ letter3
				+ letter4
				+ letter5
				+ letter6
				+ letter7
				+ letter8
				+ letter9
				+ letter10);
	}

}
