package com.workclass.forloop;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
//		for (int i = 1; i <= n; i += 2) {
//			System.out.print(i + " ");
//		}

		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
