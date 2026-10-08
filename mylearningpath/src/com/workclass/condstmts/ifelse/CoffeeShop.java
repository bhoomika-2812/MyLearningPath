package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Coffees Ordered : ");
		int order = sc.nextInt();
		if(order >= 5) {
			System.out.println("Congratulations! You get a Free Coffee");
			System.out.println("Total Coffees to Hand Over : " + (order+1));
		}else {
			System.out.println("Order Processed. No free coffee this time.");
			System.out.println("Total Coffees to Hand Over : " + order);
		}
		sc.close();
	}

}
