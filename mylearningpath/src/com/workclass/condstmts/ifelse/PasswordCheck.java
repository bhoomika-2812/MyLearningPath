package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		if(password.equals("bhoomi@12")) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Password is Incorrect");
			System.out.println("Check Once Your Password");
		}
		sc.close();
	}

}
