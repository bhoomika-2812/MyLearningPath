package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class GameScoreLevel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Score : ");
		int score = sc.nextInt();
		if (score > 100 || score < 0) {
			System.out.println("Invalid Score");
		} else if (score >= 0 && score < 40) {
			System.out.println("You are the Beginner");
		} else if (score >= 40 && score < 70) {
			System.out.println("You are the Good Player");
		} else if (score >= 70 && score < 90) {
			System.out.println("You are the Pro Player");
		} else {
			System.out.println("You are the Legendary Player");
		}
		sc.close();
	}

}
