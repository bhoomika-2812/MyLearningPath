package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeNthNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid");
		} else {
			int count = 0;
			for (int i = 0;; i++) {
				if (isPrime(i)) {
					count++;
				}
				if (count == n) {
					System.out.println(i);
					break;
				}
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
