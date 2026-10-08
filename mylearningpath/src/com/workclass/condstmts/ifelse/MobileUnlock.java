package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class MobileUnlock {

	public static void main(String[] args) {
		String Mob_Pswd = "bhoomi@12";
		int Mob_OTP = 2528;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		System.out.println("Enter OTP : ");
		int otp = sc.nextInt();
		if(password.equals(Mob_Pswd) && otp == Mob_OTP) {
			System.out.println("Mobile Unlocked");
		}
		else {
			System.out.println("Mobile Locked");
		}
		sc.close();
	}

}
