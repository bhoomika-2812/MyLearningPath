package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class GameScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Score : ");
		int cs = sc.nextInt();
		System.out.println("Enter Bonus Score : ");
		int bs = sc.nextInt();
		System.out.println("Enter Target Score : ");
		int ts = sc.nextInt();
		int final_s = cs + bs;
		if(final_s > ts) {
			System.out.println("Final Score : " + final_s);
			System.out.println("Next Level Unlocked");
		}
		else {
			System.out.println("Final Score : " + final_s);
			System.out.println("Level Locked! Try Again");
		}
		sc.close();
	}

}