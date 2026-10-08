package com.workclass.withret.nopar;

import java.util.Scanner;

public class ElectricityBill {
	static Scanner sc = new Scanner(System.in);

	static double getUnitsConsumed() {
		System.out.println("Enter Units Consumed : ");
		double units = sc.nextDouble();
		return units;
	}

	static double getRatePerUnit() {
		System.out.println("Enter the Rate Per Unit : ");
		double rate = sc.nextDouble();
		return rate;
	}

	static double getFixedCharge() {
		System.out.println("Enter Fixed Charge : ");
		double charge = sc.nextDouble();
		return charge;
	}

	public static void main(String[] args) {

		double unitsConsumed = getUnitsConsumed();
		double ratePerUnit = getRatePerUnit();
		double fixedCharge = getFixedCharge();
		System.out.println("Total Bill : " + (unitsConsumed * ratePerUnit) + fixedCharge);
	}

}
