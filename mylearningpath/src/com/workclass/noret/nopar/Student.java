package com.workclass.noret.nopar;

public class Student {
	
	static void displayStudent() {
		System.out.println("Boomika");
		Student s = new Student();
		//static to instance we can call by using obj ref var..
		s.displayStudentAge();
	}
	
	void displayStudentAge() {
		// instance to static we can call directly..
		displayStudentMarks();
		System.out.println(21);
	}
	
	static void displayStudentMarks() {
		System.out.println(100);
		// static to static we can call directly..
		displayStudentBranch();
	}
	
	void displayStudentGrade() {
		// instance to instance we can call directly..
		displayStudentYOP();
		System.out.println('O');
	}
	
	static void displayStudentBranch() {
		System.out.println("AIML");
		displayStudentId();
	}
	
	void displayStudentYOP() {
		System.out.println("2026");
		displayStudentId();
	}
	
	static void displayStudentId() {
		Student s = new Student();
		s.displayStudentCollege();
		System.out.println(10);
	}
	
	void displayStudentCollege() {
		System.out.println("Vcube");
		displayStudentLocation();
	}
	
	static void displayStudentLocation() {
		Student s = new Student();
		s.displayStudentFrnd();
		System.out.println("Hyderabad");
	}
	
	void displayStudentFrnd() {
		System.out.println("Sowjii");
	}

	public static void main(String[] args) {
		displayStudent();
		
	}

}
