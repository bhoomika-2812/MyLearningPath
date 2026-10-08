package com.workclass.switchcodes;

import java.util.Scanner;

public class PNZUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter a Number : ");
			int number = sc.nextInt();
			switch (Integer.signum(number)) {
			case 0 -> System.out.println(number + "is zero");
			case 1 -> System.out.println(number + "is positive number");
			case -1 -> System.out.println(number + "is negative number");
			default -> System.out.println("Invalid Number");
			}
			System.out.println("Do you wnat to continue click y or n : ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Okay You can exit");
		sc.close();
	}

}
