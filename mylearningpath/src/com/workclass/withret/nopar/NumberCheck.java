package com.workclass.withret.nopar;

import java.util.Scanner;

public class NumberCheck {
	static Scanner sc = new Scanner(System.in);

	static int checkNum() {
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		if (number == 0) {
			return 0;
		} else if (number < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		int num = checkNum();
		if (num == 1) {
			System.out.println("Positive number");
		} else if (num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative Number");
		}
	}

}
