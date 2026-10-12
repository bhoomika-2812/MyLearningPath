package com.arrays;

import java.util.Scanner;

public class DoubleNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		double arr[] = new double[n];
		System.out.println("Enter a Values : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextDouble();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
