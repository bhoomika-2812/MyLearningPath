package com.langfundamentals.methods;

import java.util.Scanner;

public class EmployeeSal {
	static Scanner sc = new Scanner(System.in);

	double getBasicSal() {
		System.out.println("Enter Basic Salary : ");
		double sal = sc.nextDouble();
		return sal;
	}
	
	double getHRA() {
		System.out.println("Enter your HRA : ");
		double hra = sc.nextDouble();
		return hra;
	}
	
	double getBonus() {
		System.out.println("Enter Your Bonus : ");
		double bonus = sc.nextDouble();
		return bonus;
	}

	void main() {
		System.out.println("Main Method Started..");
		double basicSal = getBasicSal();
		double hra = getHRA();
		double bonus = getBonus();
		System.out.println("Total Salary : " + (basicSal+hra+bonus));
		System.out.println("Main Method Ended...");
		
	}

}
