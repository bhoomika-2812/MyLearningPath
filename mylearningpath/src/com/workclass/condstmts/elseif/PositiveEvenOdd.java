package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class PositiveEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Negative Number");
		} else if (number == 0) {
			System.out.println("Zero");
		} else if (number > 0 && number % 2 == 0) {
			System.out.println("Positive Even Number");
		} else {
			System.out.println("Positive Odd Number");
		}
		sc.close();
	}

}

