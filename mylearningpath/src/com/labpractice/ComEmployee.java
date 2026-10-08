package com.labpractice;

public class ComEmployee {
	
	int empId;
	String empName;
	int salary;
	int experience;
	char grade;
	boolean status;
	
	void displayDetails(int i,String n,int s,int e,char g,boolean st) {
		System.out.println("Employee Id : " + i);
		System.out.println("Employee Name : " + n);
		System.out.println("Salary : " + s);
		System.out.println("Experience : " + e);
		System.out.println("Grade : " + g);
		System.out.println("Status : " + st);

		
	}

	public static void main(String[] args) {
		
		ComEmployee e1 = new ComEmployee();
		System.out.println("Employee 1 Detais..");
		e1.displayDetails(1, "Bhoomika",85000,0,'O',true);
		ComEmployee e2 = new ComEmployee();
		System.out.println("Employee 2 Detais..");
		e2.displayDetails(2, "Asmitha",70000,1,'S',true);
		ComEmployee e3 = new ComEmployee();
		System.out.println("Employee 3 Detais..");
		e3.displayDetails(3, "Sowji",65000,0,'S',false);

	}

}
