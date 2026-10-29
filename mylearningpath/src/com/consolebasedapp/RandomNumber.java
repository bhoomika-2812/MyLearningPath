package com.consolebasedapp;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int rn = rd.nextInt(101);
		int n;
		int i = 1;
		do {
			System.out.println("Guess a Number (1 to 100) : ");
			n = sc.nextInt();
			if (rn == n) {
				System.out.println("Congratulationssss!!!!");
				break;
			}
			if (i < 3) {
				System.out.println("Sorry.. Try again");
			}
			i++;
		} while (i <= 3 && rn != n);

		if (rn != n) {
			System.out.println("Sorry..Attempts Completed..");
			System.out.println("Better Luck Next time");
			System.out.println("Correct Number is : " + rn);
		}
		sc.close();
	}

}
