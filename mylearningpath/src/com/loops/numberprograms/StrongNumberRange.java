package com.loops.numberprograms;

import java.util.Scanner;

public class StrongNumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (strongNumber(i)) {
				System.out.println(i + " ");
			}
		}

		sc.close();
	}

	static boolean strongNumber(int n) {
		int s = 0;
		int temp = n;
		while (n > 0) {
			int r = n % 10;
			s = s + fact(r);
			n = n / 10;
		}
		if (s == temp) {
			return true;
		}
		return false;
	}

	static int fact(int r) {
		int f = 1;
		for (int i = r; i >= 1; i--) {
			f = f * i;
		}
		return f;
	}

}
