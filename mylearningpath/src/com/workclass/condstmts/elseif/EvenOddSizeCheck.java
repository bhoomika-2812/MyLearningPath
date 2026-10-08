package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class EvenOddSizeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Negative Number");
		} else if (number == 0) {
			System.out.println("Zero");
		} else {
			if (number % 2 == 0) {
				if (number > 50) {
					System.out.println("Large Even");
				} else {
					System.out.println("Small Even");
				}
			} else {
				if (number > 50) {
					System.out.println("Large Odd");
				} else {
					System.out.println("Small Odd");
				}
			}
		}
		sc.close();

	}
}
