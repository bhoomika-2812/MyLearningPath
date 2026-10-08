package com.workclass.forloop;

import java.util.Scanner;

public class NumberWithWithoutSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		// with spaces
		System.out.println("With Spaces");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// without spaces
		System.out.println("Without Spaces");
		for (int i = 0; i <= n; i++) {
			System.out.print(i);
		}
		sc.close();
	}

}
