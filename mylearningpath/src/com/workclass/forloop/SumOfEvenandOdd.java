package com.workclass.forloop;

import java.util.Scanner;

public class SumOfEvenandOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		sumOfEvenOdd(n);
		sc.close();
	}

	public static void sumOfEvenOdd(int n) {
		int esum = 0;
		int osum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				esum += i;
			} else {
				osum += i;
			}
		}
		System.out.println("Even Numbers Sum : " + esum);
		System.out.println("Odd Numbers Sum : " + osum);

	}

}
