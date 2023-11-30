package com.skillstorm.groupwork;

public class Student {
	
	String name;
	double gpa;
	Course[] courses;
	// TODO 6 add max number courses
	int numCourses = 0;
	int MAX_NUM_COURSES = 5;
	
	public void add(Course course) {
		this.courses[numCourses] = course;
	}
	
}