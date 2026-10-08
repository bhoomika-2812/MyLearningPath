package com.loops.numberprograms;

import java.util.Scanner;

public class FactorialUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int fact = findFact(n);
		System.out.println("Factorial Of a Given Number : " + fact);
		sc.close();
	}

	static int findFact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
