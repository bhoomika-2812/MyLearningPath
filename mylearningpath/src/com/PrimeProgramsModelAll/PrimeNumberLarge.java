//Find the Largest Prime Number Less Than N

//Input: 20
//Output: 19
package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeNumberLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n <= 2) {
			System.out.println("No Large Prime Numbers");
		} else {
			for (int i = n - 1; i >= 0; i--) {
				if (prime(i)) {
					System.out.print(i + " ");
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
