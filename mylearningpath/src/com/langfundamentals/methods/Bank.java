package com.langfundamentals.methods;

import java.util.Scanner;

public class Bank {
	double balance = 10000.00;
	public static void main(String[] args) {
		System.out.println("Welcome To The Canara Bank");
		Bank b = new Bank();
		b.showBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to deposit Payment : ");
		double amount = sc.nextDouble();
		b.showDeposit(amount);
		System.out.println("Enter the Withdraw Payment : ");
		double amount1 = sc.nextDouble();
		b.withDraw(amount1);
		sc.close();
	}
	void withDraw(double amount) {
		balance = balance - amount;
		showBalance();
	}
	void showDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	void showBalance() {
		System.out.println("Your Balance is : "+balance);
		System.out.println("Thank Youuu!!!");
	}

}
