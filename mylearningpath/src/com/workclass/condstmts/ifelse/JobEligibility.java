package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class JobEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Qualification : ");
		String qualification = sc.nextLine();
		if(age >= 21 && qualification.equals("B.Tech")) { //.equalsIgnoreCase()--> b.tech
			System.out.println("You are eligible for this job");
		}
		else {
			System.out.println("You are not eligible");
		}
		sc.close();
	}

}
