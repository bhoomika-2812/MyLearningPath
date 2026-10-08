package com.warningwork;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number : ");
		int month = sc.nextInt();
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		checkDays(month, year);
		sc.close();
	}

	public static void checkDays(int month, int year) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Month has 31 days");
			break;
		case 4, 6, 9, 11:
			System.out.println("Month has 30 days");
			break;
		case 2:
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("February has 29 days");
			} else {
				System.out.println("February has 28 days");
			}

			break;
		default:
			System.out.println("Invalid Month");
		}
	}
}