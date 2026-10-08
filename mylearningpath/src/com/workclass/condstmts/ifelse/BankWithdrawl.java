package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class BankWithdrawl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Balance : ");
		double balance = sc.nextDouble();
		System.out.println("Enter Withdrawl Amount : ");
		double wamount = sc.nextDouble();
		if(balance > wamount) {
			System.out.println("Withdrawl Successful");
			System.out.println("Remaining Balance: " + (balance-wamount));
		}
		else {
			System.out.println("Insufficient Balance");
			System.out.println("Remaining Balance : " + balance);
		}
		sc.close();
	}

}
