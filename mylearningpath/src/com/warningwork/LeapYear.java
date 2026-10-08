package com.warningwork;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		checkLeapYear(year);
		sc.close();
	}

	public static void checkLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}

	}

}
