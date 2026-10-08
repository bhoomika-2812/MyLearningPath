// example 5 : 5^2 = 25 where that given number is in square then it is automorphic..

package com.loops.numberprograms;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		automorphic(n);
		sc.close();
	}

	static void automorphic(int n) {

		String str = Integer.toString(n);
		int digitCount = str.length();
		int t = (int) Math.pow(10, digitCount);
		int square = n * n;
		int lastDigits = square % t;
		if (lastDigits == n) {
			System.out.println(square + " is a automorphic");
		} else {
			System.out.println(square + " is not a automorphic");
		}

	}

}
