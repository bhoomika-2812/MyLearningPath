package com.arrays;

import java.util.Scanner;

public class LongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		long arr[] = new long[n];
		System.out.println("Enter the Values : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		for(long val : arr) {
			System.out.println(val);
		}
		sc.close();
	}

}
