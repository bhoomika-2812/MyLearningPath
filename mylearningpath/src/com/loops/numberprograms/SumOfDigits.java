package com.loops.numberprograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int sumOfDigits = sumOfDigits(n);
		System.out.println("Sum Of Digits : " + sumOfDigits);
		sc.close();
	}

	static int sumOfDigits(int n) {
		int sum = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		return sum;
	}

}
