package com.workclass.forloop;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println(sumOfNumbers(n));
		sc.close();
	}

	public static int sumOfNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
