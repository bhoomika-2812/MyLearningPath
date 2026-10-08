package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberCategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if (number == 0) {
			System.out.println("Zero");
		} else if (number > 0 && number % 2 == 0) {
			System.out.println("Positive Even");
		} else if (number < 0 && number % 2 == 0) {
			System.out.println("Negative Even");
		} else if (number > 0 && number % 2 != 0) {
			System.out.println("Positive Odd");
		} else if (number < 0 && number % 2 != 0) {
			System.out.println("Negative Odd");
		}
		sc.close();
	}
}
