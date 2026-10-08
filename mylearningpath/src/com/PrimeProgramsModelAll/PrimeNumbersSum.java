package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeNumbersSum {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("Invalid");
		} else {
			int sum = 0;
			for (int i = 2; i <= n; i++) {
				if (isPrime(i)) {
					sum += i;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
