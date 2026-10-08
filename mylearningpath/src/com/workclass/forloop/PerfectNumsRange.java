package com.workclass.forloop;

import java.util.Scanner;

public class PerfectNumsRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		long n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (perfectNums(i) == i) {
				System.out.println(i + " ");
			}
		}
		sc.close();
	}

	public static int perfectNums(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
