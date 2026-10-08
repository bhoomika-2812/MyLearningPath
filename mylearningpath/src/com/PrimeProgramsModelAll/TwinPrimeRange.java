package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class TwinPrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number1 : ");
		int m = sc.nextInt();
		System.out.println("Enter a Number2 : ");
		int n = sc.nextInt();
		if (m > n) {
			System.out.println("Invalid Range");
		} else if (m < 0 || n < 0) {
			System.out.println("Invalid Negative Range");
		} else {
			for (int i = m; i <= n - 2; i++) {
				if (isPrime(i) && isPrime(i + 2)) {
					System.out.println("(" + i + "," + (i + 2) + ")");
				}
			}
		}
		sc.close();
	}

	static boolean isPrime(int n) {
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
