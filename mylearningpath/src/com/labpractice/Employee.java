/*1.Create a Java class Employee for a company.
Create separate methods to print each employee detail.
Display the following details:
Employee name
Employee ID
Department
Salary
Experience
Company name
Call all the methods from the main() method.*/
package com.labpractice;

public class Employee {
	
	static void getEmpName() {
		String name = "Bhoomika";
		System.out.println("EMp Name : " +name);
	}
	void getEmpId() {
		int id = 101;
		System.out.println("EMp Id : " +id);
	}
	void getDept() {
		String dept = "Developing";
		System.out.println("EMp Dept : " +dept);
	}
	void getSal() {
		double sal = 85000.00;
		System.out.println("Emp sal : " +sal);
	}
	void getExperience() {
		int exp = 2;
		System.out.println("EMp exp : " +exp);
	}
	void getCompany() {
		String com = "Accenture";
		System.out.println("Emp company : " +com);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		getEmpName();
		e.getEmpId();
		e.getDept();
		e.getSal();
		e.getExperience();
		e.getCompany();
	}
}
