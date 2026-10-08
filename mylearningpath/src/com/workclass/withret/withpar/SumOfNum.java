package com.workclass.withret.withpar;

import java.util.Scanner;

public class SumOfNum {

	static int sumOfTwo(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number 2 : ");
		int num2 = sc.nextInt();
		int sum = sumOfTwo(num1, num2);
		System.out.println("Sum of Two Numbers is " + sum);
		sc.close();
	}

}
