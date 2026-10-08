package com.loops.numberprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		boolean status = armstrong(n);
		if (status) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
		sc.close();
	}

	static boolean armstrong(int n) {
		boolean status = false;
		int temp = n;
		int n1 = n;
		int sum = 0;
		int c = 0;

		while (n1 > 0) {
			c++;
			n1 = n1 / 10;
		}

		while (n > 0) {
			int d = n % 10;
			sum = (int) (sum + Math.pow(d, c));
			n = n / 10;
		}

		if (sum == temp) {
			status = true;
		}
		return status;
	}

}
