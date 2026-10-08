/*.Write a Java Program to complete below requirements 
a) Take variables as studentId, studentName, gender, branchName,collegeName 
with corresponding data types 
b) Take a Method To display the student Details 
c) Try to add atleast two student data */
package com.labpractice;

public class Student1 {

	static String collegeName = "PACE";
	static String branch = "AIML";

	Integer sId;
	String sName;
	Character gender;

	void displayStudentDetails(Integer i, String n, Character g) {
		System.out.println("Student Id : " + i);
		System.out.println("Student Name : " + n);
		System.out.println("Gender : " + g);
		System.out.println("College Name : " + collegeName);
		System.out.println("Branch : " + branch);
	}

	public static void main(String[] args) {

	    collegeName = "VCUBE";
		Student1 s1 = new Student1();
		System.out.println("Student 1 Details.....");
		s1.displayStudentDetails(101, "Bhoomika", 'F');
		
		Student1 s2 = new Student1();
		System.out.println("Student 2 Details.....");
		s1.displayStudentDetails(102, "Asmithaa", 'F');

	}

}
