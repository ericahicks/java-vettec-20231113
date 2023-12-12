package com.skillstorm.groupwork;

import java.util.ArrayList;

public class TestStudentUtilities {
	
	public static void main(String[] args) {
		// TODO 07 Make sure StudentUtilities tests pass
		test1();
		test2();
		test3();
		test4();
	}
	
	/**
	 * Tests getStraightAStudents() with an empty list
	 */
	public static void test1() {
		ArrayList<Student> aStudents = 
				StudentUtilities.getStraightAStudents(new ArrayList<Student>());
		System.out.println(aStudents);
	}
	
	/**
	 * Tests getStraightAStudents() with null instead of a list
	 */
	public static void test2() {
		try {
			StudentUtilities.getStraightAStudents(null);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Tests getStraightAStudents() with some straight A students
	 */
	public static void test3() {
		Student student1 = new Student("Ann");
		student1.addGrade("A");
		Student student2 = new Student("Bob");
		student2.addGrade("A");
		student2.addGrade("B");
		Student student3 = new Student("Al");
		student3.addGrade("A");
		student3.addGrade("A");
		student3.addGrade("A");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		ArrayList<Student> aStudents = 
				StudentUtilities.getStraightAStudents(students);
		System.out.println(aStudents);
	}

	/**
	 * Tests getStraightAStudents() with no straight A students
	 */
	public static void test4() {
		Student student1 = new Student("Ann");
		student1.addGrade("C");
		Student student2 = new Student("Bob");
		student2.addGrade("B");
		student2.addGrade("B");
		Student student3 = new Student("Al");
		student3.addGrade("A");
		student3.addGrade("B");
		student3.addGrade("A");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		ArrayList<Student> aStudents = 
				StudentUtilities.getStraightAStudents(students);
		System.out.println(aStudents);
	}

}
