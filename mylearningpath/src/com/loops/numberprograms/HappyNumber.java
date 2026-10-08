//Enter a Number :
//19  Happy Number

//19 → 1² + 9² = 82
//82 → 8² + 2² = 68
//68 → 6² + 8² = 100
//100 → 1² + 0² + 0² = 1

//Enter a Number :
//2 Not a Happy Number

//Because its sequence eventually enters the cycle:

//2 → 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 ...

package com.loops.numberprograms;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid");
		} else {
			int temp = n;
			while (true) {
				temp = digitSquare(temp);
				if (temp == 1) {
					System.out.println("Happy Number");
					break;
				}
				if (temp == 4) {
					System.out.println("Not a Happy Number");
					break;
				}
			}
		}
		sc.close();
	}

	static int digitSquare(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum = sum + (d * d);
			n = n / 10;
		}
		return sum;
	}

}
