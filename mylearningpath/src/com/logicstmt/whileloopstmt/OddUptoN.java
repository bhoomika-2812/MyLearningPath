package com.logicstmt.whileloopstmt;

import java.util.Scanner;

public class OddUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int i = 1;
		while (n >= i) {
			System.out.print(i + " ");
			i += 2;
		}
		sc.close();
	}

}
