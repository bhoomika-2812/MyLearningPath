package com.loops.numberprograms;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int rev = reverseOfNum(n);
		if (n == rev) {
			System.out.println("Palindome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

	static int reverseOfNum(int n) {
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

}
