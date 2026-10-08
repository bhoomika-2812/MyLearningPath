package com.workclass.noret.withpar;

import java.util.Scanner;

public class Student {
	void setStuName(String name) {
		System.out.println("Student Name : " +name);
	}
	void setAge(byte a) {
		System.out.println("Student Age : " +a);
	}
	void setAdmYear(short y) {
		System.out.println("Admission Year : " +y);
	}
	void setRollNo(int r) {
		System.out.println("Roll No : " +r);
	}
	void setMobile(long m) {
		System.out.println("Mobile No : "+m);
	}
	void setPer(float p) {
		System.out.println("Percentage : "+p);
	}
	void setFees(double f) {
		System.out.println("Fess : "+f);
	}
	void setGrade(char g) {
		System.out.println("Grade : "+g);
	}
	void setPassed(boolean pa) {
		System.out.println("Status : "+pa);
	}
	void setStuId(Integer i) {
		System.out.println("Student ID : "+i);
	}
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Age : ");
		byte b = sc.nextByte();
		System.out.println("Enter admission year : ");
		short y = sc.nextShort();
		System.out.println("ENter roll number : ");
		int r = sc.nextInt();
		System.out.println("Enter Mobile Number : ");
		long m = sc.nextLong();
		System.out.println("ENter Percentage : ");
		float p = sc.nextFloat();
		System.out.println("Enter fees : ");
		double f = sc.nextDouble();
		System.out.println("Enter Grade : ");
		char g = sc.next().charAt(0);
		System.out.println("ENter Status : ");
		boolean pa = sc.nextBoolean();
		System.out.println("ENter Student Id : ");
		Integer i = sc.nextInt();
		s.setStuName(name);
		s.setAge(b);
		s.setAdmYear(y);
		s.setRollNo(r);
		s.setMobile(m);
		s.setPer(p);
		s.setFees(f);
		s.setGrade(g);
		s.setPassed(pa);
		s.setStuId(i);
		sc.close();
	}
}
