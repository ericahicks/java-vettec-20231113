package com.skillstorm.groupwork.tests;

import com.skillstorm.groupwork.Course;
import com.skillstorm.groupwork.Student;

public class StudentCoursesTest {
	
	public static void main(String[] args) {

		Course course = new Course("Java Vettec 20231113");
		
		course.enroll(null);
		
		Student student = new Student();
		student.add(course);
	}

}
