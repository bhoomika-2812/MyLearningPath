package com.workclass.withret.withpar;

import java.util.Scanner;

public class Div5and10 {

	public static boolean checkDiv(int number) {
		if (number % 5 == 0 && number % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		if (checkDiv(number) == true) {
			System.out.println(number + " is divisible by both 5 and 10");
		} else {
			System.out.println(number + " is not divisible by both 5 and 10");
		}
		sc.close();
	}

}
