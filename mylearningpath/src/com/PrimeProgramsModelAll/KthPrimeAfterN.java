package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class KthPrimeAfterN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("Enter K value : ");
		int k = sc.nextInt();
		int i = n + 1;
		int c = 0;
		while (true) {
			if (isPrime(i)) {
				c++;
				if (c == k) {
					System.out.println(i);
					break;
				}
			}
			i++;
			sc.close();
		}
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
