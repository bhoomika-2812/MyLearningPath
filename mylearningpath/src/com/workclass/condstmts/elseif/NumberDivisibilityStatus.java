package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberDivisibilityStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
			System.out.println("Divisible by 2, 3 and 5");
		} else if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("Divisible by 2 and 3");
		} else if (number % 2 == 0 && number % 5 == 0) {
			System.out.println("Divisible by 2 and 5");
		} else if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("Divisible by 3 and 5");
		} else if (number % 2 == 0) {
			System.out.println("Divisible by 2");
		} else if (number % 3 == 0) {
			System.out.println("Divisible by 3");
		} else if (number % 5 == 0) {
			System.out.println("Divisible by 5");
		} else {
			System.out.println("Not Divisible by 2, 3 or 5");
		}
		sc.close();
	}

}
