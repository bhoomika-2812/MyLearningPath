package com.arrays;

import java.util.Scanner;

public class BooleanNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		boolean arr[] = new boolean[n];
		System.out.println("Enter a Values : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextBoolean();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
