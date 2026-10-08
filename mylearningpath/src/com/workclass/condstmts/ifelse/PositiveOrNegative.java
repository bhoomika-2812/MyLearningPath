package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		if(number >= 0) {
			System.out.println(number + " is Positive");
		}
		else {
			System.out.println(number + " is negative");
		}
		sc.close();

	}

}
