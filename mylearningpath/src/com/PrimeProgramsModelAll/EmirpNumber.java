package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class EmirpNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int rn = reverse(n);
		if (n < 0) {
			System.out.println("Invalid");
		} else {
			if (n != rn) {
				if (isPrime(n) && isPrime(rn)) {
					System.out.println("Emirp");
				} else {
					System.out.println("Not Emirp");
				}

			} else {
				System.out.println("Not Emirp");
			}
		}
		sc.close();
	}

	static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev;
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
