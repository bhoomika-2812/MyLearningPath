package com.workclass.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println(reverse(n));
		sc.close();
	}

	static int reverse(int n) {
		int sum = 0;
		for (; n != 0; n = n / 10) {
			int d = n % 10;
			sum = (sum * 10) + d;
		}
		return sum;

	}

}
