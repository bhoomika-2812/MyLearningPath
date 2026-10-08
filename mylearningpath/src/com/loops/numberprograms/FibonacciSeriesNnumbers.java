package com.loops.numberprograms;

import java.util.Scanner;

public class FibonacciSeriesNnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		fibonacci(n);
		sc.close();
	}

	static void fibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 1; i <= n - 2; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

}
