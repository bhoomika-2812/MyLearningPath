package com.logicstmt.whileloopstmt;

import java.util.Scanner;

public class EvenUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int i = 2;
		while (i <= n) {
			System.out.print(i + " ");
			i += 2;
		}
		sc.close();
	}

}
