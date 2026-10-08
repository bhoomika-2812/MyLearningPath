package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class SalComparision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp1 Salary : ");
		double salary1 = sc.nextDouble();
		System.out.println("Enter Emp2 Salary : ");
		double salary2 = sc.nextDouble();
		if(salary1 > salary2) {
			System.out.println("Emp1 Salary is greater");
		}
		else {
			System.out.println("Emp2 Salary is greater");
		}
		sc.close();
	}

}
