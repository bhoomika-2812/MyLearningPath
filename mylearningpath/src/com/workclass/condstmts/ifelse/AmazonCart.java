package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class AmazonCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Items in Cart : ");
		int items = sc.nextInt();
		if (items <= 10) {
			System.out.println("Your cart looks safe! Keep shopping.");
		} else {
			System.out.println("Warning: Your cart is getting dangerous! Check your wallet.");
		}
		sc.close();
	}

}
