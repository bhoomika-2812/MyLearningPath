package com.workclass.switchcodes;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		System.out.println("Movie Ticket Numbers");
		String yn = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Movie Number : ");
			int number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.println("Movie Name: Pushpa");
				System.out.println("Ticket Price: ₹250/-");
				break;
			case 2:
				System.out.println("Movie Name: Kalki");
				System.out.println("Ticket Price: ₹200/-");
				break;
			case 3:
				System.out.println("Movie Name: Bahubali");
				System.out.println("Ticket Price: ₹300/-");
				break;
			case 4:
				System.out.println("Movie Name: RRR");
				System.out.println("Ticket Price: ₹350/-");
				break;
			default:
				System.out.println("Movie not available");
			}
			System.out.println("Do you want to enter movie number..? If yes click y or If no click n");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("You Click Exit");
		sc.close();
	}

}
