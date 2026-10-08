package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class ShoppingBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price of Product 1 : ");
		double product1 = sc.nextDouble();
		System.out.println("Enter Price of Product 2 : ");
		double product2 = sc.nextDouble();
		System.out.println("Enter Budget : ");
		double budget = sc.nextDouble();
		double sum = product1 + product2;
		if (sum > budget) {
			System.out.println("Total Amount : " + sum);
			System.out.println("Exceeds Budget");
		}
		else {
			System.out.println("Low Budget");
		}
		sc.close();
	}

}
