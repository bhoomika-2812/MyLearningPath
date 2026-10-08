package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("You are Eligible for driving");
		} else {
			System.out.println("Bachaa Gaadivi Pakkaki Vellu");
		}
		sc.close();

	}

}
