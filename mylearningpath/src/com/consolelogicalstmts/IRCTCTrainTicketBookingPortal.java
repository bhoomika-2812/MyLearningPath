package com.consolelogicalstmts;

import java.util.Scanner;

public class IRCTCTrainTicketBookingPortal {

	public static void main(String[] args) {

		System.out.println("Welcome to VCube IRCTC Railway Booking !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();

		System.out.println("Hello " + name + "!! Nice to meet you.");

		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();

		if (age >= 18) {

			System.out.println("Age requirement is satisfied.");

			System.out.println("Do you have a valid ID proof : ");
			boolean proof = sc.nextBoolean();

			if (proof) {

				System.out.println("ID proof verified successfully.");

				sc.nextLine();

				System.out.println("Enter Source Station : ");
				String source = sc.nextLine();

				System.out.println("Enter Destination Station : ");
				String destination = sc.nextLine();

				if (source.equalsIgnoreCase("hyderabad") && destination.equalsIgnoreCase("bangalore")) {

					System.out.println("Hyderabad to Bangalore Journey Started.");

					System.out.println("Is the train available : ");
					boolean train_avail = sc.nextBoolean();

					if (train_avail) {

						System.out.println("Train is available.");

						System.out.println("Are Seats available : ");
						boolean seats_avail = sc.nextBoolean();

						if (seats_avail) {

							System.out.println("Seats are available.");

							System.out.println("Enter number of passengers : ");
							int num_pass = sc.nextInt();

							if (num_pass >= 1 && num_pass <= 6) {

								System.out.println("Number of passengers : " + num_pass);

								System.out.println("Enter ticket price : ");
								double price = sc.nextDouble();

								System.out.println("Ticket price : " + price);

								System.out.println("Enter your account balance : ");
								double balance = sc.nextDouble();

								if (balance >= price) {

									System.out.println("Account balance is sufficient.");

									System.out.println("Do you want AC class : ");
									boolean ac = sc.nextBoolean();

									if (ac) {

										System.out.println("AC Class Selected.");
										System.out.println("Congratulations " + name + " !!");
										System.out.println("Your train ticket has been booked successfully.");
										System.out.println("Have a safe journey !!");

									} else {

										System.out.println("Non-AC Class Selected.");
										System.out.println("Congratulations " + name + " !!");
										System.out.println("Your train ticket has been booked successfully.");
										System.out.println("Have a safe journey !!");
									}

								} else {

									System.out.println("Account balance is insufficient.");
									System.out.println("Please add sufficient balance to book the ticket.");
								}

							} else {

								System.out.println("Maximum 6 passengers are allowed.");
							}

						} else {

							System.out.println("Seats are not available.");
						}

					} else {

						System.out.println("Train is not available.");
					}

				} else {

					System.out.println("Sorry !! That route is not accepted.");
				}

			} else {

				System.out.println("ID Proof Not Verified.");
				System.out.println("Ticket booking cannot be continued.");
			}

		} else {

			System.out.println("Sorry !! You must be at least 18 years old.");
		}

		sc.close();
	}
}