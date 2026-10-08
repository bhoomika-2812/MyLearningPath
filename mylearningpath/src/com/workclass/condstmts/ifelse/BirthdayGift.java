package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class BirthdayGift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Gifts Received : ");
		int gifts = sc.nextInt();
		if (gifts >= 3) {
			System.out.println("The birthday was a huge success! 🎉");
		} else {
			System.out.println("A bit quiet this time, but hope you had fun! 🎂");
		}
		sc.close();
	}

}
