package com.logicstmt.whileloopstmt;

import java.util.Scanner;

public class NtoOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		while (n >= 1) {
			System.out.print(n + " ");
			n--;
		}
		sc.close();
	}

}
