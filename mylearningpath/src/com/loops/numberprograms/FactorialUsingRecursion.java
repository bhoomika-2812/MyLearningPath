package com.loops.numberprograms;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int fact = findFact(n);
		System.out.println("Factorial Of a Given Number is : " + fact);
		sc.close();
	}

	static int findFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n - 1);
	}

}
