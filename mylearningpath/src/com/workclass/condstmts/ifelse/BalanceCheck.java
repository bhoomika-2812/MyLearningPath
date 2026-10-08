package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class BalanceCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Balance : ");
		double balance = sc.nextDouble();
		if(balance > 5500) {
			System.out.println("Your Balance is Minimum Limit");
		}
		else {
			System.out.println("Your Balance is below the Minimum Limit");
			System.out.println("You can Deposit some amount");
		}
		sc.close();
	}

}
