package com.consolebasedapp;

import java.util.Scanner;

public class OnlineVotingMS {

	public static void main(String[] args) {

		System.out.println("========== ONLINE VOTING & VOTER MANAGEMENT SYSTEM ==========");

		Scanner sc = new Scanner(System.in);

		String voterName = "";
		String voterId = "";
		char gender = ' ';
		int age = 0;

		boolean isRegistered = false;
		boolean hasVoted = false;

		int bhoomiVotes = 0;
		int nagarjunaVotes = 0;
		int sowjiiVotes = 0;
		int bunnyVotes = 0;
		int notaVotes = 0;

		// VOTER REGISTRATION

		System.out.println("\n========== VOTER REGISTRATION ==========");

		System.out.println("Enter Voter Name : ");
		voterName = sc.nextLine();

		System.out.println("Enter Age : ");
		age = sc.nextInt();

		if (age >= 18) {

			System.out.println("Enter Gender (M/F) : ");
			gender = sc.next().charAt(0);

			if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {

				System.out.println("Enter Voter ID : ");
				voterId = sc.next();

				if (!voterId.isEmpty()) {

					isRegistered = true;

					System.out.println("\nVoter Registered Successfully!");

					// ELSE-IF FOR VOTER CATEGORY

					if (age >= 18 && age <= 25) {
						System.out.println("Voter Category : Young Voter");
					} else if (age >= 26 && age <= 50) {
						System.out.println("Voter Category : Adult Voter");
					} else {
						System.out.println("Voter Category : Senior Voter");
					}

				} else {

					System.out.println("Invalid Voter ID.");
					System.out.println("Registration Failed.");

				}

			} else {

				System.out.println("Invalid Gender.");
				System.out.println("You are NOT eligible to vote.");

			}

		} else {

			System.out.println("You are NOT eligible to vote.");
			System.out.println("Minimum voting age is 18.");

		}

		// MAIN MENU ONLY IF REGISTRATION IS SUCCESSFUL

		if (isRegistered) {

			int menuChoice;

			do {

				System.out.println("\n========== MAIN MENU ==========");
				System.out.println("1. Cast Vote");
				System.out.println("2. View Candidate List");
				System.out.println("3. Check Voter Status");
				System.out.println("4. View Voting Results");
				System.out.println("5. Exit");
				System.out.println("Enter your choice : ");

				menuChoice = sc.nextInt();

				switch (menuChoice) {

				case 1 -> {

					System.out.println("\n========== CAST VOTE ==========");

					if (hasVoted) {

						System.out.println("You have already voted using Voter ID : " + voterId);
						System.out.println("Multiple voting is NOT allowed.");

					} else {

						System.out.println("Voter ID : " + voterId);
						System.out.println("Voter ID Verified Successfully!");

						System.out.println("\n========== CANDIDATES ==========");
						System.out.println("1. Bhoomi");
						System.out.println("2. Nagarjuna");
						System.out.println("3. Sowjii");
						System.out.println("4. Bunny");
						System.out.println("5. NOTA");

						System.out.println("\nEnter your choice : ");
						int candidateChoice = sc.nextInt();

						switch (candidateChoice) {

						case 1 -> {

							System.out.println("\nYou selected : Bhoomi");
							System.out.println("Are you sure you want to cast your vote?");
							System.out.println("1. Confirm");
							System.out.println("2. Cancel");

							int confirm = sc.nextInt();

							if (confirm == 1) {
								bhoomiVotes++;
								hasVoted = true;

								System.out.println("Vote is Captured for Bhoomi");
								System.out.println("Thank You for Voting!");

							} else {
								System.out.println("Vote Cancelled.");
							}
						}

						case 2 -> {

							System.out.println("\nYou selected : Nagarjuna");
							System.out.println("Are you sure you want to cast your vote?");
							System.out.println("1. Confirm");
							System.out.println("2. Cancel");

							int confirm = sc.nextInt();

							if (confirm == 1) {
								nagarjunaVotes++;
								hasVoted = true;

								System.out.println("Vote is Captured for Nagarjuna");
								System.out.println("Thank You for Voting!");

							} else {
								System.out.println("Vote Cancelled.");
							}
						}

						case 3 -> {

							System.out.println("\nYou selected : Sowjii");
							System.out.println("Are you sure you want to cast your vote?");
							System.out.println("1. Confirm");
							System.out.println("2. Cancel");

							int confirm = sc.nextInt();

							if (confirm == 1) {
								sowjiiVotes++;
								hasVoted = true;

								System.out.println("Vote is Captured for Sowjii");
								System.out.println("Thank You for Voting!");

							} else {
								System.out.println("Vote Cancelled.");
							}
						}

						case 4 -> {

							System.out.println("\nYou selected : Bunny");
							System.out.println("Are you sure you want to cast your vote?");
							System.out.println("1. Confirm");
							System.out.println("2. Cancel");

							int confirm = sc.nextInt();

							if (confirm == 1) {
								bunnyVotes++;
								hasVoted = true;

								System.out.println("Vote is Captured for Bunny");
								System.out.println("Thank You for Voting!");

							} else {
								System.out.println("Vote Cancelled.");
							}
						}

						case 5 -> {

							System.out.println("\nYou selected : NOTA");
							System.out.println("Are you sure you want to cast your vote?");
							System.out.println("1. Confirm");
							System.out.println("2. Cancel");

							int confirm = sc.nextInt();

							if (confirm == 1) {
								notaVotes++;
								hasVoted = true;

								System.out.println("Vote is Captured for NOTA");
								System.out.println("Thank You for Voting!");

							} else {
								System.out.println("Vote Cancelled.");
							}
						}

						default -> {

							System.out.println("Invalid Candidate Selection.");
							System.out.println("Please choose a valid option.");

						}

						}
					}
				}

				case 2 -> {

					System.out.println("\n========== CANDIDATE LIST ==========");

					System.out.println("1. Bhoomi");
					System.out.println("2. Nagarjuna");
					System.out.println("3. Sowjii");
					System.out.println("4. Bunny");
					System.out.println("5. NOTA");

				}

				case 3 -> {

					System.out.println("\n========== VOTER STATUS ==========");

					System.out.println("Voter Name : " + voterName);
					System.out.println("Voter ID   : " + voterId);

					if (hasVoted) {
						System.out.println("Voting Status : Vote Already Cast");
					} else {
						System.out.println("Voting Status : Not Voted");
					}

				}

				case 4 -> {

					System.out.println("\n========== VOTING RESULTS ==========");

					System.out.println("Bhoomi       : " + bhoomiVotes + " Votes");
					System.out.println("Nagarjuna    : " + nagarjunaVotes + " Votes");
					System.out.println("Sowjii       : " + sowjiiVotes + " Votes");
					System.out.println("Bunny        : " + bunnyVotes + " Votes");
					System.out.println("NOTA         : " + notaVotes + " Votes");

					if (bhoomiVotes > nagarjunaVotes && bhoomiVotes > sowjiiVotes && bhoomiVotes > bunnyVotes) {

						System.out.println("Leading Candidate : Bhoomi");

					} else if (nagarjunaVotes > sowjiiVotes && nagarjunaVotes > bunnyVotes) {

						System.out.println("Leading Candidate : Nagarjuna");

					} else if (sowjiiVotes > bunnyVotes) {

						System.out.println("Leading Candidate : Sowjii");

					} else if (bunnyVotes > 0) {

						System.out.println("Leading Candidate : Bunny");

					} else {

						System.out.println("No votes have been recorded yet.");

					}

				}

				case 5 -> {

					System.out.println("\nThank You for using");
					System.out.println("Online Voting & Voter Management System!");
					System.out.println("Have a Great Day!");

				}

				default -> {

					System.out.println("\nInvalid Menu Choice.");
					System.out.println("Please select a choice between 1 and 5.");

				}

				}

			} while (menuChoice != 5);

		}

		sc.close();

	}

}