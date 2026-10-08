package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class RoomCleaning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Days Since Last Cleaning : ");
		int clean = sc.nextInt();
		if (clean >= 3) {
			System.out.println("Time to clean up! Your room is getting messy.");
		} else {
			System.out.println("Your room is clean and tidy! ");
		}
		sc.close();
	}

}
