package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class SalaryLoanEligiblity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		if(salary >= 900000) {
			System.out.println("You are Eligible for Loan");
		}
		else {
			System.out.println("Concentrate on your career");
		}
		sc.close();
	}

}
