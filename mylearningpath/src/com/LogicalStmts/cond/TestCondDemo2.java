package com.LogicalStmts.cond;

import java.util.Scanner;

public class TestCondDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		double salary = sc.nextDouble();
		
		if(salary >= 600000.00) {
			System.out.println("Congratulations...");
			System.out.println("Your Eliglible for Loan");
		}else {
			System.out.println("Concentrate on your career");
			System.out.println("Thank You");
		}
		sc.close();

	}

}
