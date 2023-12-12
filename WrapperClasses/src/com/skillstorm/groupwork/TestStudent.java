package com.skillstorm.groupwork;

public class TestStudent {
	
	public static void main(String[] args) {
		// TODO 06 Make sure Student tests pass
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	
	public static void test1() {
		System.out.println("Grade A should be valid: " + Student.validGrade("A"));
		System.out.println("Grade B should be valid: " + Student.validGrade("B"));
		System.out.println("Grade C should be valid: " + Student.validGrade("C"));
		System.out.println("Grade D should be valid: " + Student.validGrade("D"));
		System.out.println("Grade F should be valid: " + Student.validGrade("F"));
		System.out.println("validGrade(E) should be false and is: " + Student.validGrade("E"));
		System.out.println("validGrade(null) should be false and is: " + Student.validGrade(null));
		System.out.println("validGrade(\"\") should be false and is: " + Student.validGrade(""));
	}
	
	public static void test2() {
		Student sam = new Student("Sam");
		sam.addGrade("A");
		System.out.println(sam.getGrades());
		sam.addGrade("E");
		System.out.println(sam.getGrades());
	}
	
	public static void test3() {
		Student sam = new Student("Sam");
		sam.addGrade("A");
		double gpa = sam.calculateGPA();
		System.out.printf("Sam's GPA is %.2f", gpa);
		
	}
	
	public static void test4() {
		Student sam = new Student("Sam");
		sam.addGrade("A");
		sam.addGrade("B");
		double gpa = sam.calculateGPA();
		System.out.println();
		System.out.printf("Sam's GPA is %.2f", gpa);
		
	}
	
	public static void test5() {
		Student sam = new Student("Sam");
		sam.addGrade("C");
		sam.addGrade("C");
		double gpa = sam.calculateGPA();
		System.out.println();
		System.out.printf("Sam's GPA is %.2f", gpa);
		
	}

}
