package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberTypeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if(number < 0) {
			System.out.println("Negative Number");
		}else if (number == 0) {
			System.out.println("Zero");
		}else if(number >= 1 && number < 10) {
			System.out.println("Single Digit");
		}else if(number >= 10 && number < 100) {
			System.out.println("Two Digit");
		}else if(number >= 100 && number < 1000) {
			System.out.println("Three Digit");
		}else {
			System.out.println("Four or More Digits");
		}
		sc.close();
	}

}
