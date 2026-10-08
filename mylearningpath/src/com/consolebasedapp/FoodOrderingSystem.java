/*1.Create a Java program for a Food Ordering System using switch-case.
Requirements:
Display the following menu:
1 → Pizza – ₹200
2 → Burger – ₹120
3 → Biryani – ₹180
4 → Noodles – ₹100
Ask the user to select an item and enter the quantity.
Calculate the total bill = item price × quantity.
Output:
Display the selected item, price, quantity, and total bill.*/
package com.consolebasedapp;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		System.out.println("Menu Card..");
		System.out.println("1 → Pizza – ₹200");
		System.out.println("2 → Burger – ₹120");
		System.out.println("3 → Biryani – ₹180");
		System.out.println("4 → Noodles – ₹100");

		Scanner sc = new Scanner(System.in);

		int pizzaPrice = 0;
		int burgerPrice = 0;
		int biryaniPrice = 0;
		int noodlesPrice = 0;
		String yn = "";

		do {
			System.out.println("Enter Food item number..");
			int item = sc.nextInt();
			switch (item) {
			case 1 -> {
				System.out.println("Enter the Quantity : ");
				int quantity = sc.nextInt();
				pizzaPrice = 200 * quantity;
				System.out.println("Total Bill Of Pizaa is : " + pizzaPrice);

			}
			case 2 -> {
				System.out.println("Enter the Quantity : ");
				int quantity = sc.nextInt();
				burgerPrice = 120 * quantity;
				System.out.println("Total Bill Of Burger is : " + burgerPrice);
			}
			case 3 -> {
				System.out.println("Enter the Quantity : ");
				int quantity = sc.nextInt();
				biryaniPrice = 180 * quantity;
				System.out.println("Total Bill Of Biryani is : " + biryaniPrice);
			}
			case 4 -> {
				System.out.println("Enter the Quantity : ");
				int quantity = sc.nextInt();
				noodlesPrice = 100 * quantity;
				System.out.println("Total Bill Of Noodles is : " + noodlesPrice);
			}
			default -> System.out.println("Entered item is not Available Right Now..");
			}
			System.out.println("Do you want to Continue the menu  Click Y , Otherwise N");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("Total Price Of Your Order : " + (pizzaPrice + burgerPrice + biryaniPrice + noodlesPrice));
		System.out.println("Exit From the Order..");

	}

}
