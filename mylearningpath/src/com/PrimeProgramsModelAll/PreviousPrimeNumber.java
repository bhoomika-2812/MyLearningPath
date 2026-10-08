package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PreviousPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Invalid");
		} else if (n <= 2) {
			System.out.println("No Previous Prime");
		} else {
			for (int i = n - 1; i >= 2; i--) {
				if (isPrime(i)) {
					System.out.println(i);
					break;
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
