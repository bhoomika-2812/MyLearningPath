package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeFactorsDistinctSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("No Prime Fcators");
		} else {
			factors(n);
		}
		sc.close();
	}

	static boolean isPrime(int n) {
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

	static void factors(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (isPrime(i)) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}

}
