package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberDivisibilityChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("Divisible by 3 and 5");
		} else if (number % 3 == 0) {
			System.out.println("Divisible by 3");
		} else if (number % 5 == 0) {
			System.out.println("Divisible by 5");
		} else {
			System.out.println("Not Divisible by 3 or 5");
		}
		sc.close();
	}

}
