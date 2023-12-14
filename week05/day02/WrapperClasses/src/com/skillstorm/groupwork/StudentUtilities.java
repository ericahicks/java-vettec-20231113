package com.skillstorm.groupwork;

import java.util.ArrayList;

public class StudentUtilities {
	
	/**
	 * For each student in the array, return the student with a 4.0 GPA
	 * 
	 * @param students A list of students
	 * @return A list of students with all A's
	 */
	public static ArrayList<Student> getStraightAStudents(ArrayList<Student> students) {
		// TODO 04 return all students with a GPA of 4.0
		if (students == null) {
			throw new IllegalArgumentException("student list is null");
		}
		ArrayList<Student> aStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.calculateGPA() == 4.0) {
				aStudents.add(student);
			}
		}
		return aStudents;
	}
	
	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students) {
		// TODO 05a return all students with a GPA of 2.5 or higher
		ArrayList<Student> goodStudents = new ArrayList<>();
		if (students == null || students.isEmpty()) {
			return goodStudents;
		}
		for (Student student : students) {
			if (student.calculateGPA() >= 2.5) {
				goodStudents.add(student);
			}
		}
		return goodStudents;
	}
	
	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students, double gpa) {
		// TODO 05b return all students with a GPA of provided gpa or higher
		ArrayList<Student> goodStudents = new ArrayList<>();
		if (students == null || students.isEmpty()) {
			return goodStudents;
		}
		for (Student student : students) {
			if (student.calculateGPA() >= gpa) {
				goodStudents.add(student);
			}
		}
		return goodStudents;
	}

}
