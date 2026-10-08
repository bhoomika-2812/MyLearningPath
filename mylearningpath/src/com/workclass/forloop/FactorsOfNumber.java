package com.workclass.forloop;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		factors(n);
		sc.close();
	}

	public static void factors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter a Number : "); int n = sc.nextInt(); for (int i =
	 * 1; i <= n / 2; i++) { if (factors(n, i)) { System.out.println(i); } }
	 * 
	 * sc.close(); }
	 * 
	 * public static boolean factors(int n, int i) { if (n % i == 0) { return true;
	 * } return false; }
	 */

}
