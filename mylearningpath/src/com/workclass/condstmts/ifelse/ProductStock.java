package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class ProductStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Available Stock : ");
		int avai_stock = sc.nextInt();
		System.out.println("Enter Sold Quantity : ");
		int sold_stock = sc.nextInt();
		if(avai_stock > sold_stock) {
			System.out.println("Stock Updated Successfully");
			System.out.println("Remaining Stock : " + (avai_stock - sold_stock));
		}
		else {
			System.out.println("Order Denied: Out of Stock");
			System.out.println("Remaining Stock : " + avai_stock);
		}
		sc.close();
	}

}
