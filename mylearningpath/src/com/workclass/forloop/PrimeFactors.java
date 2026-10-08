package com.workclass.forloop;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("No Prime Factors!!");
		} else {
			primefactors(n);
		}
		sc.close();
	}

	static void primefactors(int n) {
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (prime(i)) {
					System.out.println(i + " ");
				}
			}
		}
	}

	static boolean prime(int n) {
		boolean status = true;
		if (n < 2) {
			status = false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
