package com.skillstorm.groupwork;

import java.time.LocalDate;
import java.util.Arrays;

public class Course {
	
	// TODO 3 Fully encapsulate the class
	private String name;
	private Teacher teacher;
	private Student[] students;
	private static int MAX_NUM_STUDENTS = 30;
	private int numberOfStudents;
	
	// TODO 0 Add a static block
	// Static blocks only run once when the class is loaded in memory
	static {
		// Get the year, if it is 2023 only allow 30 students
		// if it is after 2024 allow 40 students
		if (LocalDate.now().getYear() >= 2024) {
			MAX_NUM_STUDENTS = 40;
		}
	}
	
	public Course(String name) {
		this.name = name;
		// TODO 1 What defaults do I want to change?
		this.students = new Student[MAX_NUM_STUDENTS];
	}
	
	// TODO 2 Methods for adding and removing students
	// Only allow changes to the students array through these methods
	// DO NOT ALLOW DIRECT ACCESS TO THE STUDENTS ARRAY
	public void enroll(Student student) {
		if (numberOfStudents < MAX_NUM_STUDENTS && student.numCourses < student.MAX_NUM_COURSES) {
			this.students[numberOfStudents] = student;
			student.add(this); // here I use the this keyword as a reference to the object itself
			numberOfStudents++;
		}
	}
	
	public void withdraw(Student student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (student.equals(students[i])) { // compares memory addresses
				students[i] = students[numberOfStudents - 1];
				students[numberOfStudents - 1] = null;
				break;
			}
		}
		// replace the empty spot with the last student?
		// last student is at the index numberOfStudents - 1;
		
		numberOfStudents--;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public static int getMAX_NUM_STUDENTS() {
		return MAX_NUM_STUDENTS;
	}


	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	@Override
	public String toString() {
		return "Course [name=" + name + ", teacher=" + teacher + ", students=" + Arrays.toString(students)
				+ ", numberOfStudents=" + numberOfStudents + "]";
	}
	
	// TODO 4 Getters and setters?
	
}
