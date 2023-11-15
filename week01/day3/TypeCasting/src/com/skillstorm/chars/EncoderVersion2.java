package com.skillstorm.chars;

import java.util.Scanner;

public class EncoderVersion2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 10 character message: ");
		String message = scanner.next();
		int index = 1;
		char c1 = (char) (message.charAt(index++) + 1);
		char c2 = (char)(message.charAt(index++) + 3);
		char c3 = (char)(message.charAt(index++) + 5);
		char c4 = (char)(message.charAt(index++) + 7);
		char c5 = (char)(message.charAt(index++) + 9); 
		char c6 = (char)(message.charAt(index++) + 11);
		char c7 = (char)(message.charAt(index++) + 13);
		char c8 = (char)(message.charAt(index++) + 15);
		char c9 = (char)(message.charAt(index++) + 17);
		char c10 = (char)(message.charAt(index++) + 19);
		String encodedMessage = "" +  c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;
		System.out.println("The encoded message is: " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10);
		index = 0;
		c1 = (char) (encodedMessage.charAt(index++) - 1);
		c2 = (char)(encodedMessage.charAt(index++) - 3);
		c3 = (char)(encodedMessage.charAt(index++) - 5);
		c4 = (char)(encodedMessage.charAt(index++) - 7);
		c5 = (char)(encodedMessage.charAt(index++) - 9); 
		c6 = (char)(encodedMessage.charAt(index++) - 11);
		c7 = (char)(encodedMessage.charAt(index++) - 13);
		c8 = (char)(encodedMessage.charAt(index++) - 15);
		c9 = (char)(encodedMessage.charAt(index++) - 17);
		c10 = (char)(encodedMessage.charAt(index++) - 19);
		System.out.println("The decoded message is: " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10);

		
		scanner.close();
	}

}
