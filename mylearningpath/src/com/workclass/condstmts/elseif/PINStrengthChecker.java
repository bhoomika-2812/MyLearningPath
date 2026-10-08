package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class PINStrengthChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Pin : ");
		int pin = sc.nextInt();
		if (pin < 1000 || pin > 9999) {
			System.out.println("Invalid Pin");
		} else if (pin % 2 == 0) {
			System.out.println("Strong Pin");
		} else {
			System.out.println("Weak Pin");
		}
		sc.close();
	}

}
