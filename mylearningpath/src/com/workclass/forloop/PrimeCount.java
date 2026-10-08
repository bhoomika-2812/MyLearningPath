package com.workclass.forloop;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (primeC(i) == 1) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	static int primeC(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return 1;
		}
		return 0;
	}

}
