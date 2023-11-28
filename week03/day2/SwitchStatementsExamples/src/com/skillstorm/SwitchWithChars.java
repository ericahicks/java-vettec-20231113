package com.skillstorm;

public class SwitchWithChars {

	public static void main(String[] args) {
		String gradeStr = "A, F, B, D, F";

		char[] gradeArr = gradeStr.replace(", ", "").toCharArray();

		for (char grade : gradeArr) {
			switch (grade) {
				case 65:
				case 66:
				case 67:
					System.out.println("Pass");
					break;
				case 68:
				case 70:
					System.out.println("Fail");
					break;
				default:
					System.out.println("Huh?");
			}
		}
	}

}
