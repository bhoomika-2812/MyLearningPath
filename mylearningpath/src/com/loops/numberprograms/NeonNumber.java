//Ex - 9 : 9 × 9 = 81       
//         8 + 1 = 9
//         9 == 9
//         → Neon Number ✅

//Ex - 5 : 5 × 5 = 25
//         2 + 5 = 7
//         7 != 5
//         → Not a Neon Number ❌

package com.loops.numberprograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Invalid");
		} else {
			int temp = digitSum(n);
			if (temp == n) {
				System.out.println("Neon Number");
			} else {
				System.out.println("Not a Neon Number");
			}
		}
		sc.close();
	}

	static int digitSum(int n) {
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			int d = square % 10;
			sum = sum + d;
			square = square / 10;
		}
		return sum;

	}

}
