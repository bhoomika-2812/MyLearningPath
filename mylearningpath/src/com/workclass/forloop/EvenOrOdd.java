package com.workclass.forloop;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (checkEvenOrOdd(n) == 1) {
			System.out.println(n + " is a Even Number");
		} else {
			System.out.println(n + " is a Odd Number");
		}
		sc.close();
	}

	static int checkEvenOrOdd(int n) {
		if (n % 2 == 0) {
			return 1;
		}
		return 0;
	}

}
