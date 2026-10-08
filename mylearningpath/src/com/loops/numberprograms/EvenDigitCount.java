package com.loops.numberprograms;

import java.util.Scanner;

public class EvenDigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int c = 0;
		while (n > 0) {
			int d = n % 10;
			if (d % 2 == 0) {
				c++;
			}
			n = n / 10;
		}
		System.out.println(c);
		sc.close();
	}

}
