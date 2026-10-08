package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimeNFirstNumbers {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n < 2) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid");
		} else {
			int count = 0;
			int i = 0;
			while (count < n) {
				if (isPrime(i)) {
					System.out.print(i + " ");
					count++;
				}
				i++;
			}
		}
		sc.close();
	}
}