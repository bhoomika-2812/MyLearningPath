package com.labpractice;

public class Student {

	String name;
	int rollNo;
	String mobile;
	String email;
	String branch;

	static String college = "VCube";
	static String location = "Hyd";

	public static void main(String[] args) {

		Student s = new Student();
		Student s1 = new Student();

		s.name = "Bhoomika";
		s.rollNo = 10;
		s.mobile = "7013080175";
		s.email = "bhoomishettyyyy@gmail.com";
		s.branch = "Aiml";

		s1.name = "Asmitha";
		s1.rollNo = 11;
		s1.mobile = "7232782733";
		s1.email = "asmi23@gmail.com";
		s1.branch = "cse";
		
		System.out.println("Name : " + s.name);
		System.out.println("Roll No : " + s.rollNo);
		System.out.println("Mobile No : " + s.mobile);
		System.out.println("E-mail : " + s.email);
		System.out.println("Branch : " + s.branch);
		System.out.println("College : " + college);
		System.out.println("Location : " + location);
		
		college = "PACE";
		System.out.println("Second Student");
		System.out.println("Name : " + s1.name);
		System.out.println("Roll No : " + s1.rollNo);
		System.out.println("Mobile No : " + s1.mobile);
		System.out.println("E-mail : " + s1.email);
		System.out.println("Branch : " + s1.branch);
		System.out.println("College : " + college);
		System.out.println("Location : " + location);

	}

}
