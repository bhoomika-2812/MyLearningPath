package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Negative Number");
		} else if (num == 0) {
			System.out.println("Zero");
		} else if (num > 0 && num <= 10) {
			System.out.println("Small Number");
		} else if (num > 10 && num <= 50) {
			System.out.println("Medium Number");
		} else if (num > 50 && num <= 100) {
			System.out.println("Large Number");
		} else if (num > 100) {
			System.out.println("Very Large Number");
		} else {
			System.out.println("Negative Value");
		}
		sc.close();
	}

}
