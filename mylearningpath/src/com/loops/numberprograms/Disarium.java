// example 135 : 1 digit place 1, 3-2 and 5-3 --> 1^1 + 3^2 + 5^3 = 135(original number)

package com.loops.numberprograms;

import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int sum = disariumNum(n);
		if (n == sum) {
			System.out.println(sum + " is a Disarium Number");
		} else {
			System.out.println(sum + " is Not a Disarium Number");
		}
		sc.close();

	}

	static int disariumNum(int n) {
		int sum = 0;
		String str = Integer.toString(n);
		int digitCount = str.length();
		while (n > 0) {
			int d = n % 10;
			sum = (int) (sum + Math.pow(d, digitCount));
			n = n / 10;
			digitCount--;

		}
		return sum;
	}

}
