package com.workclass.withret.withpar;

import java.util.Scanner;

public class SquareNumber {

	static int squareNumber(int number) {
		int val = number * number;
		return val;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int check = squareNumber(number);
		System.out.println("Square of " + number + " is : " + check);
		sc.close();
	}
}
