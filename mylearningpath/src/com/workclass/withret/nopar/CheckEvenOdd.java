package com.workclass.withret.nopar;

import java.util.Scanner;

public class CheckEvenOdd {
	static Scanner sc = new Scanner(System.in);

	static int even() {
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int number = even();
		if (number == 1) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
