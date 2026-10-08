package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Adult Ticket");
		}
		else {
			System.out.println("Child Ticket");
		}
		sc.close();
	}

}
