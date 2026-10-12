package com.arrays;

import java.util.Scanner;

public class StringDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter a Strings : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		for(String word : arr) {
			System.out.println(word);
		}
		sc.close();
	}

}
