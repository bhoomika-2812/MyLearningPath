package com.workclass.switchcodes;

import java.util.Scanner;

public class EvenorOddUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter a Number : ");
			int number = sc.nextInt();
			switch (number % 2) {
			case 0 -> System.out.println(number + "is an Even Number");
			case 1 -> System.out.println(number + "is an Odd Number");
			default -> System.out.println("Invalid Number");
			}
			System.out.println("Do you want to Continue Click y or n");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Okay, You can Exit");
		sc.close();
	}

}
