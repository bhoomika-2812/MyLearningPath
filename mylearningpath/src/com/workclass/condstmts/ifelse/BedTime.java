package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class BedTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Hour (1-12) : ");
		int time = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Am or Pm : ");
		String period = sc.nextLine();
		if ((period.equalsIgnoreCase("PM") && time >= 10)
				|| (period.equalsIgnoreCase("AM") && time >= 1 && time <= 5)) {
			System.out.println("It's time to sleep! Go to bed");
		} else {
			System.out.println("You can stay awake! ");
		}
		sc.close();
	}

}
