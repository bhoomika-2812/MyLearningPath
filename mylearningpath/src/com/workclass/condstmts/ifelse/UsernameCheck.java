package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class UsernameCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String registered = "bhoomi12";
		System.out.println("Enter UserName : ");
		String username = sc.nextLine();
		if(!username.equals(registered)) {
			System.out.println("Username is diff from the registered username");
		}else {
			System.out.println("UserName is same from the reg username");
		}
		sc.close();
	}

}
