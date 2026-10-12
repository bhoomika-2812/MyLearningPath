package com.arrays;

import java.util.Scanner;

public class IntegerNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		System.out.println("Enter a Values : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(Integer val : arr) {
			System.out.println(val);
		}
		sc.close();
	}

}