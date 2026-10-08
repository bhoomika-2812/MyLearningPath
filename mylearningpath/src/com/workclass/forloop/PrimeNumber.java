package com.workclass.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (isPrime(n) == 1) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is not a Prime Number");
		}
		sc.close();
	}

	static int isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return 1;
		}
		return 0;
	}

}
