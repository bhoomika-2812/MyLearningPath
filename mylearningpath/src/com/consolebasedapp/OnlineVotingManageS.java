package com.consolebasedapp;

import java.util.Scanner;

public class OnlineVotingManageS {

	public static void main(String[] args) {
		System.out.println("Online Voting & Voter Management System");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Voter Registration");
		System.out.println("2. Cast Vote");
		System.out.println("3. View Candidate List");
		System.out.println("4. Check Voter Eligibility");
		System.out.println("5. Exit");
		System.out.println("Enter your choice : ");
		int number = sc.nextInt();
		sc.nextLine();
		switch (number) {
		case 1 -> {
			System.out.println("======= Voter Registration =========");
			System.out.println("Enter Voter Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			if (age >= 18) {
				System.out.println("Enter Gender(M/F) : ");
				char gender = sc.next().charAt(0);
				if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
					System.out.println("Enter Voter ID : ");
					String voter_id = sc.next();
					System.out.println("Voter Registered Successfully!");

					int menuChoice;
					do {
						System.out.println("1. Voter Registration");
						System.out.println("2. Cast Vote");
						System.out.println("3. View Candidate List");
						System.out.println("4. Check Voter Eligibility");
						System.out.println("5. Exit");
						System.out.println("Enter your choice : ");
						menuChoice = sc.nextInt();
					} while (menuChoice != 5);
				} else {
					System.out.println("Invalid Gender.");
					System.out.println("You are NOT eligible to vote.");
				}
			} else {
				System.out.println("You are NOT eligible to vote.");
				System.out.println("Minimum voting age is 18.");
			}
		}
		case 2 -> {
			System.out.println("======= Cast Vote ========");
			System.out.println("Enter Voter ID : ");
			int v_id = sc.nextInt();
			System.out.println("Voter ID Verified Successfully!");
			System.out.println("========= Candidates =========");
			System.out.println("1. Bhoomi ");
			System.out.println("2. Nagarjuna ");
			System.out.println("3. Sowjii ");
			System.out.println("4. Bunny ");
			System.out.println("5. NOTA ");
			System.out.println("");
		}
		}
	}

}
