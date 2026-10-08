package com.workclass.withret.withpar;

import java.util.Scanner;

public class CubeNumber {

	static int cubicNumber(int number) {
		int val = number * number * number;
		return val;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int check = cubicNumber(number);
		System.out.println("Cubic of " + number + " is : " + check);
		sc.close();
	}

}
