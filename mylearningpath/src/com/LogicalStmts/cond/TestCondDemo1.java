package com.LogicalStmts.cond;

import java.util.Scanner;

public class TestCondDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Congratulations");
			System.out.println("You are eligible for vote and driving");
		} else {
			System.out.println("Sorry You are a Kid");
			System.out.println("Thank You");
		}
		sc.close();
	}

}
