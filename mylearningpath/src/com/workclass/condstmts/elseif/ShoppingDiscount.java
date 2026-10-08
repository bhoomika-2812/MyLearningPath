package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchase Amount : ");
		double amount = sc.nextDouble();
		if(amount >= 10000.00) {
			System.out.println("You get 30% Discount");
		}else if(amount >= 5000) {
			System.out.println("You get 20% Discount");
		}else if(amount >= 2000) {
			System.out.println("You get 10% Discount");
		}else {
			System.out.println("No Discount");
		}
		sc.close();
	}

}
