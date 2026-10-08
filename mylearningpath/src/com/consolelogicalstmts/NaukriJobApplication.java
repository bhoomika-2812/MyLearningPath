package com.consolelogicalstmts;

import java.util.Scanner;

public class NaukriJobApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Naukari Job Portal!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + " !! Nice to meet you.");
		System.out.println("Enter your qualification : ");
		String degree = sc.nextLine();
		System.out.println("Enter your B.Tech Percentage : ");
		float percentage = sc.nextFloat();

		if (degree.equalsIgnoreCase("B.Tech") && percentage > 60.00) {
			System.out.println("Your qualification is matching.");
			System.out.println("Your B.Tech percentage is eligible.");

			System.out.println("Okay !! Let's continue the selection process.");

			System.out.println("Enter Your Experience : ");
			int exp = sc.nextInt();
			if (exp > 0) {
				System.out.println("Your Experience is Eligible");

				System.out.println("Enter your Java skill rating : ");
				int rate = sc.nextInt();
				if (rate > 6 && rate <= 10) {
					System.out.println("Your Java skills are matching.");

					System.out.println("Enter your expected salary : ");
					double salary = sc.nextDouble();
					if (salary <= 600000 && salary >= 300000) {
						System.out.println("Congratulations Bhoomi !!");
						System.out.println("You are shortlisted for the interview.");
					} else {
						System.out.println("We will Get Back Soon..");
						System.out.println("We think about your Salary");
					}
				} else {
					System.out.println("You need to improve your skill.");
				}
			} else {
				System.out.println("Sorry to inform We Hired Only Experience Candidates");
				System.out.println("Keep Applying...You are a Fresher");
			}
		} else {
			System.out.println("Sorry !! Your Profile is not matching.");
		}
		sc.close();
	}

}
