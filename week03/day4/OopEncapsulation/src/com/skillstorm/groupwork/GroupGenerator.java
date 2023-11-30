package com.skillstorm.groupwork;

public class GroupGenerator {
	
	/**
	 * Using Hunter's strategy for removing a Student,
	 * Write a method that creates randomized groups of Students
	 */
	public static Student[][] generateGroups(Student[] students, int numGroups, int numStudents) {
		int numStudentsPerGroup = (int) Math.ceil(numStudents / (double) numGroups);
		Student[][] groups = new Student[numGroups][numStudentsPerGroup];
		for (int i = 0; i < numStudents; i++) {
			// Generate a random number between 0 and numStudents - i
			int chosenStudent = (int) (Math.random() * (numStudents - 1));
			int groupNum = i / numStudentsPerGroup;
			int positionInGroup = i % numStudentsPerGroup;
			// Put the student into the group array of st
			groups[groupNum][positionInGroup] = students[chosenStudent];
			// Remove student from list of Students
			students[i] = students[numStudents - i]; 
			students[numStudents - i] = null;
		}
		return groups;
	}

}
