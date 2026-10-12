package com.arrays;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		String combined = "";
		char c[] = new char[n];
		
		System.out.println("Enter a Characters : ");
		for(int i = 0;i<n;i++) {
			c[i] = sc.next().charAt(0);
		}
		
		for(char ch : c) {
			combined = combined + ch;
		}
		System.out.println(combined);
		sc.close();
	}

}
