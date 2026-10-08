package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class BonusAmount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		System.out.println("Enter experience : ");
		int exp = sc.nextInt();
		int bonus = 0;
		if(exp >= 10) {
			bonus = 20;
		}else if(exp >= 5){
			bonus = 15;
		}else if(exp >= 2) {
			bonus = 10;
		}else {
			bonus = 5;
		}
		
		double b_amount = sal * bonus/100;
		System.out.println("Bonus Percentage : " + bonus);
		System.out.println("Bonus Amount : " + b_amount);
		sc.close();
	}

}
