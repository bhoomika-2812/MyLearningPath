package com.workclass.switchcodes;

import java.util.Scanner;

public class BusTicketBooking {

	public static void main(String[] args) {
		System.out.println("Welcome to Abhi Busses");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Bus Type : ");
			int type = sc.nextInt();
			switch (type) {
			case 1 -> {
				System.out.println("Bus Type: Ordinary Bus");
				System.out.println("Ticket Price: ₹150/-");
			}
			case 2 -> {
				System.out.println("Bus Type: Express Bus");
				System.out.println("Ticket Price: ₹200/-");
			}
			case 3 -> {
				System.out.println("Bus Type: AC Bus");
				System.out.println("Ticket Price: ₹350/-");
			}
			case 4 -> {
				System.out.println("Bus Type: Sleeper Bus");
				System.out.println("Ticket Price: ₹550/-");
			}
			case 5 -> {
				System.out.println("Bus Type: Volvo Bus");
				System.out.println("Ticket Price: ₹700/-");
			}
			default -> System.out.println("Bus type not available");
			}
			System.out.println("Do you want to select another bus..?");
			System.out.println("If yes click y or If no click n..");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Okay, You Click Exit");
		sc.close();
	}

}
