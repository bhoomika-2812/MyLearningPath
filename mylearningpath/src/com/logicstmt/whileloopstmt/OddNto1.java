package com.logicstmt.whileloopstmt;

import java.util.Scanner;

public class OddNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			n--;
		}
		while (n >= 1) {
			System.out.println(n + " ");
			n -= 2;
		}
		sc.close();
	}

}
