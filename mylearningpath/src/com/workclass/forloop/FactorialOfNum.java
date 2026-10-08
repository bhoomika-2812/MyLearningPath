package com.workclass.forloop;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}

	public static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
