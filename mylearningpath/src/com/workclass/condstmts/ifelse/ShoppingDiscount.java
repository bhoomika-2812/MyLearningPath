package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchased Amount : ");
		double amount = sc.nextDouble();
		if(amount >= 5000) {
			System.out.println("You get a Discount");
		}
		else {
			System.out.println("Please Purchase More Items");
		}
		sc.close();
	}

}
