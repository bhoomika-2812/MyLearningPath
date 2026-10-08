package com.workclass.noret.withpar;

import java.util.Scanner;

public class Employee {
	static void setEmpId(int id) {
		System.out.println("Employee Id : " +id);
	}
	static void setEmpName(String name) {
		System.out.println("Employee Name : " +name);
	}
	static void setEmpAge(byte age) {
		System.out.println("Employee Age : "+age);
	}
	static void setJoinYear(short year) {
		System.out.println("Employee Joining Year : "+year);
	}
	static void setMobileNo(long mob) {
		System.out.println("Employee Mobile No : "+mob);
	}
	static void setExp(float exp) {
		System.out.println("EMployee Experience : "+exp);
	}
	static void setSal(double sal) {
		System.out.println("Employee Salary : "+sal);
	}
	static void setGrade(char grade) {
		System.out.println("Employee Grade : "+grade);
	}
	static void setStatus(boolean status) {
		System.out.println("Employee Status : "+status);
	}
	static void setEmpNumber(Integer number) {
		System.out.println("Employee Number : "+number);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		System.out.println("ENter Employee Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter Employee Age : ");
		byte age = sc.nextByte();
		System.out.println("Joining Year : ");
		short year = sc.nextShort();
		System.out.println("Enter Mobile No : ");
		long mob = sc.nextLong();
		System.out.println("Enter Experience : ");
		float exp = sc.nextFloat();
		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		System.out.println("Enter Grade : ");
		char grade = sc.next().charAt(0);
		System.out.println("Is the Employee Permanent : ");
		boolean status = sc.nextBoolean();
		System.out.println("Enter Employee Number : ");
		Integer number = sc.nextInt();
		setEmpId(id);
		setEmpName(name);
		setEmpAge(age);
		setJoinYear(year);
		setMobileNo(mob);
		setExp(exp);
		setSal(sal);
		setGrade(grade);
		setStatus(status);
		setEmpNumber(number);
		sc.close();
	}

}
