/*1.Write a Java Program to complete below requirements 

> Create a Class with name Online voting system 
Program should ask user age , gender, voterIdNo 

Conditions :- 
> if age is less than 18 display “not eligible “ message 

> If eligible then only ask about gender 

> If gender is not M or F display not eligible , if eligible then Ask next one as Enter VoterId No 

> if user enters VoterId Display 4 candidate options 
And ask user to press any one options below message if user chooses any option display with proper message  
ex :-“ Vote is Captured for Mark Antony ” use candidate name in the message 

> If user Chooses different option rather than above mentioned , Display message as Thanks for Voting To NOTA*/
package com.labpractice;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		System.out.println("Welcome to Online Voting System");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter User Age : ");
		int age = sc.nextInt();

		if (age >= 18) {

			System.out.println("Enter Gender : ");
			char gender = sc.next().charAt(0);
			sc.nextLine();
			if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
				System.out.println("You are Eligible to Vote");
				System.out.println("Enter Voter ID : ");
				String voterId = sc.nextLine();
				System.out.println("Please Choose above 4 Options : ");
				System.out.println("1.Bhoomi , 2.Nagarjuna , 3.Sowjii , 4.Bunny ");
				int option = sc.nextInt();
				switch (option) {
				case 1 -> {
					System.out.println("Vote is Captured for Bhoomi..");
					System.out.println("Thank you For Your Voting..");
				}
				case 2 -> {
					System.out.println("Vote is Captured for Nagarjuna..");
					System.out.println("Thank you For Your Voting..");
				}
				case 3 -> {
					System.out.println("Vote is Captured for Sowjii..");
					System.out.println("Thank you For Your Voting..");
				}
				case 4 -> {
					System.out.println("Vote is Captured for Bunny..");
					System.out.println("Thank you For Your Voting..");
				}
				default -> {
					System.out.println("Thanks for Voting to NOTA");
				}
				}

			} else {
				System.out.println("You are not Eligible");
			}

		} else {
			System.out.println("You are not Eligible to Vote");
		}
		sc.close();
	}

}
