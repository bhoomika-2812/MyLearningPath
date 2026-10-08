package com.loops.numberprograms;

import java.util.Scanner;

public class PrimeNth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0;; i++) {
			if (prime(i)) {
				count++;

			}
			if (count == n) {
				System.out.print(i);
				break;
			}
			sc.close();
		}
	}

	static boolean prime(int n) {
		boolean status = true;
		if (n <= 1) {
			status = false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
