package com.warningwork;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units Consumed : ");
		int units = sc.nextInt();
		eleBill(units);
		sc.close();
	}

	public static void eleBill(int units) {
		if (units <= 0) {
			System.out.println("Invalid");
		} else if (units > 0 && units <= 100) {
			System.out.println("Electricity Bill : " + (units * 2));
		} else if (units > 100 && units <= 200) {
			System.out.println("Electricity Bill : " + (units * 3));
		} else if (units > 200 && units <= 300) {
			System.out.println("Electricity Bill : " + (units * 5));
		} else {
			System.out.println("Electricity Bill : " + (units * 7));
		}
	}

}
