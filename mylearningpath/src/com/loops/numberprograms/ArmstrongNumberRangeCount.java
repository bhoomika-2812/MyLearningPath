package com.loops.numberprograms;

import java.util.Scanner;

public class ArmstrongNumberRangeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int c=0;
		for(int i=0;i<=n;i++) {
			if(armstrong(i)) {
				c++;
			}
		}
		System.out.println(c);
		
		sc.close();
	}

	static boolean armstrong(int n) {
		boolean status = false;
		int temp = n;
		int n1 = n;
		int sum = 0;
		int c = 0;

		while (n1 > 0) {
			c++;
			n1 = n1 / 10;
		}

		while (n > 0) {
			int d = n % 10;
			sum = (int) (sum + Math.pow(d, c));
			n = n / 10;
		}

		if (sum == temp) {
			status = true;
		}
		return status;
	}

}
