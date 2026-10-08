package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeRangeSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a M number : ");
		int m = sc.nextInt();
		System.out.println("Enter a N number : ");
		int n = sc.nextInt();
		for (int i = m+1; i <= n; i++) {
			if (prime(i)) {
				System.out.println(i + " ");
				break;
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
