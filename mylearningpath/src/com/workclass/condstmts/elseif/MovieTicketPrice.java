package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class MovieTicketPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		 if (age < 0) {
			System.out.println("Invalid Age");
		}else if (age < 5) {
			System.out.println("Free Ticket");
		} else if (age >= 5 && age <= 12) {
			System.out.println("Child Ticket");
		} else if (age >= 13 && age <= 59) {
			System.out.println("Adult Ticket");
		} else {
			System.out.println("Senior Citizen Ticket");
		}
		sc.close();
	}

}
