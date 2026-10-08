package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class WeatherTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature : ");
		int temp = sc.nextInt();
		if (temp >= 40) {
			System.out.println("Extremely Hot");
		} else if (temp >= 30 && temp < 40) {
			System.out.println("Hot");
		} else if (temp >= 20 && temp < 30) {
			System.out.println("Pleasant");
		} else if (temp > 10 && temp < 20) {
			System.out.println("Cold");
		} else {
			System.out.println("Very Cold");
		}
		sc.close();
	}

}
