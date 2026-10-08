package com.workclass.switchcodes;

import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		System.out.println("Welcome To Food Menu");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Food Item Number : ");
			int item = sc.nextInt();
			switch (item) {
			case 1 -> {
				System.out.println("Food Item: Burger");
				System.out.println("Price: 99");
			}
			case 2 -> {
				System.out.println("Food Item: Pizza");
				System.out.println("Price: 299");
			}
			case 3 -> {
				System.out.println("Food Item: Biryani");
				System.out.println("Price: 399");
			}
			case 4 -> {
				System.out.println("Food Item: Fried Rice");
				System.out.println("Price: 150");
			}
			default -> System.out.println("Item not available");
			}
			System.out.println("Do you want to order another item..?");
			System.out.println("If yes click y or If no click n..");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Okay, You can Exit");
		sc.close();
	}

}
