package com.logicstmt.whileloopstmt;

import java.util.Scanner;

public class EvenNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n % 2 != 0) {
			n--;
		}
		while (n >= 2) {
			System.out.print(n + " ");
			n -= 2;
		}
		sc.close();
	}

}
