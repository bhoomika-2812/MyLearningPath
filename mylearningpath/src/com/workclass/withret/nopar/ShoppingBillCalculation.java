package com.workclass.withret.nopar;

import java.util.Scanner;

public class ShoppingBillCalculation {
	static Scanner sc = new Scanner(System.in);

	static double getProPrice() {
		System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();
		return price;
	}

	static double getDiscount() {
		System.out.println("Enter Discount : ");
		double discount = sc.nextDouble();
		return discount;
	}

	static double getGST() {
		System.out.println("Enter GST : ");
		double gst = sc.nextDouble();
		return gst;
	}

	public static void main(String[] args) {

		double proPrice = getProPrice();
		double proDiscount = getDiscount();
		double proGST = getGST();
		System.out.println("Final Bill : " + (proPrice - proDiscount + proGST));
	}

}
