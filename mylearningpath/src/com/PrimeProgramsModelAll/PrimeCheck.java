package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is not a Prime Number");
		}
		sc.close();
	}

	static boolean isPrime(int n) {
		boolean flag = true;
		if (n < 2) {
			flag = false;
		}

		for (int i = 2; i <= n / 2; i++) {
			// for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
