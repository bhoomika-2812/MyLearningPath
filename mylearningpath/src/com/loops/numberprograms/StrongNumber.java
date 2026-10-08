package com.loops.numberprograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int strongNumber = strongNumber(n);
		if (n == strongNumber) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a Strong Number");
		}
		sc.close();
	}

	static int strongNumber(int n) {
		int s = 0;
		while (n > 0) {
			int r = n % 10;
			s = s + fact(r);
			n = n / 10;
		}
		return s;
	}

	static int fact(int r) {
		int f = 1;
		for (int i = r; i >= 1; i--) {
			f = f * i;
		}
		return f;
	}

}
