package com.skillstorm;

public class LectureExample {
	
	public static void main(String[] args) {
		// example 1:
		String[] students = {"Bob", "Sue", "Joe"};
		char[] grades = {'A', 'B', 'B'};
		// Find the student with the highest grade:
		String bestStudent = null;
		int highestGrade = 'F';
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%s < %s%n", grades[i], (char) highestGrade);
			System.out.println((int) grades[i] < (int) highestGrade);
			if ((int) grades[i] < (int) highestGrade) {
				bestStudent = students[i];
				highestGrade = grades[i];
			}
		}
		System.out.println( bestStudent );
	}

}

class Student {
	String name;
	char grade;
}
