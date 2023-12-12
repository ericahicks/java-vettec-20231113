package com.skillstorm.groupwork;

import java.util.ArrayList;

public class Student {
	
	///////////////////////////////////////////////
	// Static properties
	private static long numberStudents = 0;
	
	///////////////////////////////////////////////
	// Instance properties
	private final long studentId;
	
	private String name;
	
	private final ArrayList<String> grades;;
	
	///////////////////////////////////////////////
	// Constructors
	public Student() {
		this("unknown");
	}
	
	public Student(String name) {
		this.name = name;
		this.studentId = numberStudents++;
		this.grades = new ArrayList<>();
	}
	
	///////////////////////////////////////////////
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStudentId() {
		return studentId;
	}
	
	public ArrayList<String> getGrades() {
		return new ArrayList<>(grades); // return a copy
	}
	
	///////////////////////////////////////////////
	// Methods
	public void addGrade(String grade) {
		if (!validGrade(grade))
			return;
		this.grades.add(grade);
	}
	

	public void updateGrade(int index, String newGrade) {
		if (!validGrade(newGrade))
			return;
		this.grades.set(index, newGrade);
	}
	
	static boolean validGrade(String grade) {
		// TODO 01 return true if grade is valid A B C D or F
		return false;
	}
	
	
	public double calculateGPA() {
		// TODO 03 Calculate GPA
		return 0.0;
	}
	
	/**
	 * Converts the String "A" to a number 4.0
	 * Converts the String "B" to a number 3.0
	 * Converts the String "C" to a number 2.0
	 * Converts the String "D" to a number 1.0
	 * Converts the String "F" to a number 0.0
	 * @param grade
	 * @return
	 * @throws IllegalArgumentException if grade is not A, B, C, D, or F
	 */
	public double convert(String grade) {
		// TODO 02 convert string to double
		return 0.0;
	}
	
	public String toString() {
		return String.format("Student %s has a gpa of %.2f", name, calculateGPA());
	}

}
