package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeFactorsRepetition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("No Prime Factors");
		} else {
			factorPrimes(n);
		}
		sc.close();
	}

	static void factorPrimes(int n) {
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				if (prime(i)) {
					System.out.print(i + " ");
				}
				n = n / i;
			}
		}

	}

	static boolean prime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
