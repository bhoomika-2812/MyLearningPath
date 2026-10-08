package com.warningwork;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		double basicSal = sc.nextDouble();
		double hra = 0;
		double da = 0;
		if (basicSal <= 10000) {
			hra = basicSal * 20 / 100;
			da = basicSal * 80 / 100;
			System.out.println("Basic Salary : " + basicSal);
			System.out.println("HRA : " + (hra));
			System.out.println("DA : " + (da));
			System.out.println("Gross Salary : " + (basicSal + hra + da));
		} else if (basicSal > 10000 && basicSal <= 20000) {
			hra = basicSal * 25 / 100;
			da = basicSal * 90 / 100;
			System.out.println("Basic Salary : " + basicSal);
			System.out.println("HRA : " + (hra));
			System.out.println("DA : " + (da));
			System.out.println("Gross Salary : " + (basicSal + hra + da));
		} else {
			hra = basicSal * 30 / 100;
			da = basicSal * 95 / 100;
			System.out.println("Basic Salary : " + basicSal);
			System.out.println("HRA : " + (hra));
			System.out.println("DA : " + (da));
			System.out.println("Gross Salary : " + (basicSal + hra + da));
		}
		sc.close();
	}
}