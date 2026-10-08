package com.workclass.forloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i += 2) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
