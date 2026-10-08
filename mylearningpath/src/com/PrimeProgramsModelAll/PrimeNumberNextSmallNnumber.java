/*Find the Smallest Prime Number Greater Than N

Example 1:

Input: 20
Output: 23

Example 2:

Input: 10
Output: 11*/
package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeNumberNextSmallNnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		for (int i = n+1; ; i++) {
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
