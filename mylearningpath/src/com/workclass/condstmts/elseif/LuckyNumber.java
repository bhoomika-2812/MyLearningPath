package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lucky Number : ");
		int number = sc.nextInt();
		if (number % 14 == 0) {
			System.out.println("Super Lucky Number");
		} else if (number % 7 == 0) {
			System.out.println("Lucky Number");
		} else {
			System.out.println("Not a Lucky Number");
		}
		sc.close();
	}

}
