package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electricity Units : ");
		int units = sc.nextInt();
		int rate = 0;
		if (units > 300) {
			rate = 7;
		} else if (units > 200 && units <= 300) {
			rate = 5;
		} else if (units > 100 && units <= 200) {
			rate = 3;
		} else if (units >= 0 && units <= 100) {
			rate = 2;
		} else {
			System.out.println("Invalid Units");
			//return;
		}
		if(units >= 0) {

		int bill = units * rate;
		System.out.println("Units : " + units);
		System.out.println("Rate : " + rate + "per unit");
		System.out.println("Total Bill : " + bill);
		sc.close();
		}
	}

}
