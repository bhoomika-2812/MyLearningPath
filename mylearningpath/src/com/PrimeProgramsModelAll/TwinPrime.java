package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number1 : ");
		int m = sc.nextInt();
		System.out.println("Enter a Number2 : ");
		int n = sc.nextInt();
		if (Math.abs(m - n) == 2) {
			if (isPrime(m) && isPrime(n)) {
				System.out.println("(" + m + "," + n + ")" + "Twin Prime Numbers");
			} else {
				System.out.println("not twin Prime Numbers");
			}
		} else {
			System.out.println("not twin Prime Numbers");
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
