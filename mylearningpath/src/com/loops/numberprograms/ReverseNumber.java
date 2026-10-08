package com.loops.numberprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int reverse = revNumber(n);
		System.out.println("Reverse Of a Number : " + reverse);
		sc.close();
	}

	 static int revNumber(int n) {
		int rev = 0;
		while(n>0) {
			int r = n%10;
			rev = rev * 10 + r;
			n = n/10;
		}
		return rev;
	}

}
