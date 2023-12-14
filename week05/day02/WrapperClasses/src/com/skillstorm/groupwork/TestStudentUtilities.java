package com.skillstorm.groupwork;

import java.util.ArrayList;

public class TestStudentUtilities {
	
	public static void main(String[] args) {
		// TODO 07 Make sure StudentUtilities tests pass
		test1();
		test2();
		test3();
		test4();
		test1b();
		test2b();
		test3b();
		test4b();
	}
	
	/**
	 * Tests getStraightAStudents() with an empty list
	 */
	public static void test1() {
		ArrayList<Student> aStudents = 
				StudentUtilities.getStraightAStudents(new ArrayList<Student>());
		System.out.println(">>> Calling getStraightAStudents with empty list:");
		System.out.println(aStudents);
	}
	
	/**
	 * Tests getStraightAStudents() with null instead of a list
	 */
	public static void test2() {
		try {
			System.out.println(">>> Calling getStraightAStudents with null instead of list:");
			ArrayList<Student> students = StudentUtilities.getStraightAStudents(null);
			System.out.println(students);
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
		System.out.println(">>> Calling getStraightAStudents with some A students in the list:");
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
		System.out.println(">>> Calling getStraightAStudents with no A students in the list:");
		ArrayList<Student> aStudents = 
				StudentUtilities.getStraightAStudents(students);
		System.out.println(aStudents);
	}
	
	// TODO 08 Test the getStudentsInGoodStanding
	/**
	 * Tests getStudentsInGoodStanding() with an empty list
	 */
	public static void test1b() {
		ArrayList<Student> goodStudents = 
				StudentUtilities.getStudentsInGoodStanding(new ArrayList<Student>());
		System.out.println(">>> Calling getStudentsInGoodStanding with empty list:");
		System.out.println(goodStudents);
	}
	
	/**
	 * Tests getStudentsInGoodStanding() with null instead of a list
	 */
	public static void test2b() {
		try {
			System.out.println(">>> Calling getStudentsInGoodStanding with null instead of list:");
			ArrayList<Student> students = StudentUtilities.getStudentsInGoodStanding(null);
			System.out.println(students);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Tests getStudentsInGoodStanding() with some straight A students
	 */
	public static void test3b() {
		Student student1 = new Student("Ann");
		student1.addGrade("C");
		Student student2 = new Student("Bob");
		student2.addGrade("C");
		student2.addGrade("B");
		Student student3 = new Student("Al");
		student3.addGrade("A");
		student3.addGrade("A");
		student3.addGrade("A");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		System.out.println(">>> Calling getStudentsInGoodStanding with some good students.");
		System.out.println("    Expecting: [Bob, Al]");
		ArrayList<Student> aStudents = 
				StudentUtilities.getStudentsInGoodStanding(students);
		System.out.println("    Actual:   " + aStudents);
	}

	/**
	 * Tests getStudentsInGoodStanding() with students in good standing
	 */
	public static void test4b() {
		Student student1 = new Student("Ann");
		student1.addGrade("F");
		Student student2 = new Student("Bob");
		student2.addGrade("C");
		student2.addGrade("C");
		student2.addGrade("B");
		Student student3 = new Student("Al");
		student3.addGrade("A");
		student3.addGrade("B");
		student3.addGrade("F");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);

		System.out.println(">>> Calling getStudentsInGoodStanding with no good students.");
		System.out.println("    Expecting: []");
		ArrayList<Student> goodStudents = 
				StudentUtilities.getStudentsInGoodStanding(students);
		System.out.println("    Actual:   " + goodStudents);		
	}

}
