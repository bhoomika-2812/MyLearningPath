package com.loops.numberprograms;

import java.util.Scanner;

public class EvenIndexSum1 {

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

		int d = count(n);
		int s = 0;

		while (n > 0) {
			int l = n % 10;
			if (d % 2 == 0) {
				s = s + l;
			}
			n = n / 10;
			d--;
		}
		return s;
	}
}