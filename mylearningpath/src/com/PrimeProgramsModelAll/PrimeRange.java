package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

	static boolean isPrime(int n) {
		boolean flag = true;
		if (n < 2) {
			flag = false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
