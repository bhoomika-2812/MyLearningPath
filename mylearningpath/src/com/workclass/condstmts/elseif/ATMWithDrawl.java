package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class ATMWithDrawl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Balance : ");
		double balance = sc.nextDouble();
		System.out.println("Withdrawl Amount : ");
		double draw = sc.nextDouble();
		if(balance <= 0 || draw <= 0) {
			System.out.println("Invalid Input");
		}else if(draw > balance) {
			System.out.println("Insufficient Balance");
			System.out.println("Total Balance : " + balance);
		}else {
			System.out.println("Withdrawl Successful");
			double rem_bal = balance - draw;
			if(rem_bal >= 10000) {
				System.out.println("Remaining Balance : " + rem_bal);
				System.out.println("Status : Healthy Balance");
			}else if (rem_bal >= 5000) {
				System.out.println("Remaining Balance : " + rem_bal);
				System.out.println("Status : Low Balance");
			}else {
				System.out.println("Remaining Balance : " + rem_bal);
				System.out.println("Status : Very Low Balance");
			}
		}
		sc.close();
	}

}
