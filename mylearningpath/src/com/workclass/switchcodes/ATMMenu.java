package com.workclass.switchcodes;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		System.out.println("Welcome To The ATM Menu");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Option Number : ");
		int option = sc.nextInt();
		switch (option) {
		case 1 -> System.out.println("You Selected: Check Balance");
		case 2 -> System.out.println("You Selected: Deposit");
		case 3 -> System.out.println("You Selected: Withdraw");
		case 4 -> System.out.println("You Selected: Mini Statement");
		default -> System.out.println("Invalid ATM option");
		}
		sc.close();
	}

}
