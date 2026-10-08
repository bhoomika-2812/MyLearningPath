package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberSignandSizeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Negative Number");
		} else if (number == 0) {
			System.out.println("Zero");
		} else if (number >= 1 && number <= 10) {
			System.out.println("Small Positive");
		} else if (number >= 11 && number <= 50) {
			System.out.println("Medium Positive");
		} else if (number >= 51 && number <= 100) {
			System.out.println("Large Positive");
		} else {
			System.out.println("Very Large Positive");
		}
		sc.close();
	}

}
