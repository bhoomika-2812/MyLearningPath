package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeFactorsRepititionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("No Prime Factors");
		} else {
			primeFactors(n);
		}
		sc.close();
	}

	static void primeFactors(int n) {
		int s = 0;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				if (prime(i)) {
					s=s+i;
				}
				n = n / i;
			}
		}
		System.out.println(s);
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
