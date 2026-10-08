package com.workclass.withret.nopar;

import java.util.Scanner;

public class LargestTwoNumbers {
	static Scanner sc = new Scanner(System.in);

	static int getFirstNumber() {
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		return num1;
	}

	static int getSecondNumber() {
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		return num2;
	}

	public static void main(String[] args) {
		int number1 = getFirstNumber();
		int number2 = getSecondNumber();
		if (number1 > number2) {
			System.out.println("Largest Number : " + number1);
		} else {
			System.out.println("Largest Number : " + number2);
		}
	}

}
