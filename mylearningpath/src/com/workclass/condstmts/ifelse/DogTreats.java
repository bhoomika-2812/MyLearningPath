package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class DogTreats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Treats Given Today : ");
		int treats = sc.nextInt();
		if (treats <= 3) {
			System.out.println("Your dog deserves another treat! 🐶");
		} else {
			System.out.println("No more treats! Your dog has had enough today. 🚫");
		}
		sc.close();
	}

}
