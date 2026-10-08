package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeRangeMtoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M Number : ");
		int m = sc.nextInt();
		System.out.println("Enter N Number : ");
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) {
			if (prime(i)) {
				System.out.println(i + " ");
			}
		}
		sc.close();
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
