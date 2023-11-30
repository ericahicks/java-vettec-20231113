package com.skillstorm.importexs;

public class StudentTests {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Nick";
		student.graduationDay = 12;
		student.graduationMonth = 6;
		student.graduationYear = 2024;
		
		student.printGraduation();
	}

}
