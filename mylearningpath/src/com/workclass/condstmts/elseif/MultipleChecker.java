package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class MultipleChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("Both 2 and 3");
		} else if (number % 2 == 0) {
			System.out.println("Two's Multiple");
		} else if (number % 3 == 0) {
			System.out.println("Three's Multiple");
		} else {
			System.out.println("Not a Multiple");
		}
		sc.close();
	}

}
