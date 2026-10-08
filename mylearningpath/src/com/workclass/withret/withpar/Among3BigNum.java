package com.workclass.withret.withpar;

import java.util.Scanner;

public class Among3BigNum {

	static int bigOf3Num(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3 : ");
		int num3 = sc.nextInt();
		int num = bigOf3Num(num1, num2, num3);
		System.out.println("Largest Number is : " + num);
		sc.close();
	}

}
