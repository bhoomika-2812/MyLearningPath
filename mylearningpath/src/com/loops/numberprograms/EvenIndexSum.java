package com.loops.numberprograms;

import java.util.Scanner;

public class EvenIndexSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println(evenIndex(n));
		sc.close();
	}

	static int count(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = n / 10;
		}
		return c;
	}

	static int evenIndex(int n) {

		int digit = count(n);
		int s = 0;
		if (digit % 2 == 0) {
			while (digit > 0) {
				int d = digit % 10;
				s = s + d;
				digit = digit / 10;
				d = digit % 10;
			}
		}
		return s;

	}

//	static int evenIndex(int n) {
//		int p = 1;
//		int sum = 0;
//		int c = 0;
//		while (n > 0) {
//			int r = n % 10;
//			c++;
//			if (p % 2 == 0) {
//				sum = sum + r;
//			}
//			n = n / 10;
//			p++;
//
//		}
//		return sum;
//	}

}
