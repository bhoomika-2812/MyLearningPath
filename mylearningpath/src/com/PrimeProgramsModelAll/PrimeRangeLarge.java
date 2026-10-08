
package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeRangeLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a M Number : ");
		int m = sc.nextInt();
		System.out.println("Enter a N Number : ");
		int n = sc.nextInt();
		if (n <= 2) {
			System.out.println("No Large Prime Numbers");
		} else {
			for (int i = n - 1; i >= m; i--) {
				if (prime(i)) {
					System.out.println(i + " ");
					break;
				}
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
