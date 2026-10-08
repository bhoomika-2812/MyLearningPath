package com.PrimeProgramsModelAll;

import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid");
		} else {
			primePalindrome(n);
		}
		sc.close();
	}

	static void primePalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n > 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		if (temp == rev) {
			if (prime(rev)) {
				System.out.println(temp + " : " + "is a Prime Palindrome");
			} else {
				System.out.println(temp + " : " + "is not a Prime Palindrome");
			}
		} else {
			System.out.println(temp + " : " + "is not a Prime Palindrome");
		}
	}

	static boolean prime(int rev) {
		if (rev < 2) {
			return false;
		}
		for (int i = 2; i <= rev / 2; i++) {
			if (rev % i == 0) {
				return false;
			}
		}

		return true;
	}

}
