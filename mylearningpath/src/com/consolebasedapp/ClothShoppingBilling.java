package com.consolebasedapp;

import java.util.Scanner;

public class ClothShoppingBilling {

	public static void main(String[] args) {
		System.out.println("Welcome to Bhoomika Shopping Mall..!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu Card..");
		System.out.println("1 → Mens");
		System.out.println("2 → Womens");
		System.out.println("3 → Kids");

		double mensPrice = 0;
		double womensPrice = 0;
		double kidsPrice = 0;
		// double totalPrice = 0;
		String yn = "";
		do {
			System.out.println("Enter a Category : ");
			int category = sc.nextInt();

			switch (category) {
			case 1 -> {
				String myn = "";
				do {
					System.out.println("Enter a Item : ");
					String item = sc.next();
					switch (item) {
					case "shirt" -> {
						double shirtPrice = 500.00;
						System.out.println("The Shirt Price is : " + shirtPrice);
						mensPrice = mensPrice + shirtPrice;
					}

					case "pant" -> {
						double pantPrice = 900.00;
						System.out.println("The Pant Price is : " + pantPrice);
						mensPrice = mensPrice + pantPrice;
					}

					case "jeans" -> {
						double jeansPrice = 1200.00;
						System.out.println("The Jeans Price is : " + jeansPrice);
						mensPrice = mensPrice + jeansPrice;
					}

					case "tshirt" -> {
						double tshirtPrice = 400.00;
						System.out.println("The T-Shirt Price is : " + tshirtPrice);
						mensPrice = mensPrice + tshirtPrice;
					}

					case "jacket" -> {
						double jacketPrice = 1500.00;
						System.out.println("The Jacket Price is : " + jacketPrice);
						mensPrice = mensPrice + jacketPrice;
					}
					default -> System.out.println("Entered Item is not Available..!");
					}
					System.out.println("Do you Want to Continue with Mens Click Y , Otherwise N");
					myn = sc.next();
				} while (myn.equalsIgnoreCase("y"));
				System.out.println("Exit from the Mens..");
				System.out.println("Total Mens Price is : " + mensPrice);
			}
			case 2 -> {
				String wyn = "";
				do {
					System.out.println("Enter a Item : ");
					String item = sc.next();
					switch (item) {
					case "shirt" -> {
						double shirtPrice = 650.00;
						System.out.println("The Shirt Price is : " + shirtPrice);
						womensPrice = womensPrice + shirtPrice;
					}

					case "jeans" -> {
						double jeansPrice = 1000.00;
						System.out.println("The Jeans Price is : " + jeansPrice);
						womensPrice = womensPrice + jeansPrice;
					}

					case "kurti" -> {
						double kurtiPrice = 850.00;
						System.out.println("The Kurti Price is : " + kurtiPrice);
						womensPrice = womensPrice + kurtiPrice;
					}

					case "saree" -> {
						double sareePrice = 1500.00;
						System.out.println("The Saree Price is : " + sareePrice);
						womensPrice = womensPrice + sareePrice;
					}

					case "top" -> {
						double topPrice = 550.00;
						System.out.println("The Top Price is : " + topPrice);
						womensPrice = womensPrice + topPrice;
					}
					default -> System.out.println("Entered item is not available Right Now..!!");
					}
					System.out.println("Do you want to continue with Womwns Click Y , Otherwise N");
					wyn = sc.next();
				} while (wyn.equalsIgnoreCase("y"));
				System.out.println("Exit From the Women's...");
				System.out.println("Total Womens Price is : " + womensPrice);
			}
			case 3 -> {
				String kyn = "";
				do {
					System.out.println("Enter a Item : ");
					String item = sc.next();
					switch (item) {
					case "shirt" -> {
						double shirtPrice = 450.00;
						System.out.println("The Shirt Price is : " + shirtPrice);
						kidsPrice = kidsPrice + shirtPrice;
					}

					case "pant" -> {
						double pantPrice = 550.00;
						System.out.println("The Pant Price is : " + pantPrice);
						kidsPrice = kidsPrice + pantPrice;
					}

					case "jeans" -> {
						double jeansPrice = 700.00;
						System.out.println("The Jeans Price is : " + jeansPrice);
						kidsPrice = kidsPrice + jeansPrice;
					}

					case "frock" -> {
						double frockPrice = 800.00;
						System.out.println("The Frock Price is : " + frockPrice);
						kidsPrice = kidsPrice + frockPrice;
					}

					case "tshirt" -> {
						double tshirtPrice = 350.00;
						System.out.println("The T-Shirt Price is : " + tshirtPrice);
						kidsPrice = kidsPrice + tshirtPrice;
					}
					default -> System.out.println("Entered Item is not available right now..!!");
					}
					System.out.println("Do you want to continue with Kids Click Y, Otherwise N");
					kyn = sc.next();
				} while (kyn.equalsIgnoreCase("y"));
				System.out.println("Exit from the Kids..");
				System.out.println("Total Kids Price is : " + kidsPrice);

			}
			default -> System.out.println("Entered Category is not available Right Now..!!");
			}
			System.out.println("Do you Want to Continue with Category Click Y, Otherwise N");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("Total Price : " + (mensPrice + womensPrice + kidsPrice));
	}

}
