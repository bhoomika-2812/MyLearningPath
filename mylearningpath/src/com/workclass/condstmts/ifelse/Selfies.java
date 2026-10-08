package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class Selfies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Selfies Taken Today : ");
		int selfies = sc.nextInt();
		if (selfies < 10) {
			System.out.println("Your Selfie habits are normal!");
		} else {
			System.out.println("Wow! that is too many selfies!");
		}
		sc.close();
	}

}
