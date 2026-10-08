package com.workclass.switchcodes;

import java.util.Scanner;

public class BankAccountType {

	public static void main(String[] args) {
		System.out.println("Welcome to Canara Bank");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Account Type : ");
			int account_type = sc.nextInt();
			switch (account_type) {
			case 1 -> {
				System.out.println("Account Type: Savings Account");
				System.out.println("Minimum Balance: ₹1,000/-");
			}
			case 2 -> {
				System.out.println("Account Type: Current Account");
				System.out.println("Minimum Balance: ₹5,000/-");
			}
			case 3 -> {
				System.out.println("Account Type: Salary Account");
				System.out.println("Zero Balance");
			}
			case 4 -> {
				System.out.println("Account Type: Fixed Deposit");
				System.out.println("Minimum Balance: ₹10,000/-");
			}
			default -> System.out.println("Account type not available");
			}
			System.out.println("Do you want to select another account type..?");
			System.out.println("If yes click y or If no click n");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Okay, You Can Exit");
		sc.close();
	}
}
