package com.loops.numberprograms;

import java.util.Scanner;

public class NthPerfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1;; i++) {
			if (isPerfect(i)) {
				count++;
				// System.out.println(i + " ");
				if (count == n) {
					System.out.println(i + " ");
					break;
				}

			}
		}

		sc.close();
	}

	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		}else {
			return false;
		}
		
	}

}
