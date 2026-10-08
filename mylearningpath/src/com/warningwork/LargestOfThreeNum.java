package com.warningwork;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number 2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter a Number 3 : ");
		int num3 = sc.nextInt();
		largeOf3(num1, num2, num3);
		sc.close();

	}

	public static void largeOf3(int num1, int num2, int num3) {
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Number 1 and 2 and 3 are Equal");
		} else if (num1 == num2 && num1 > num3) {
			System.out.println("Number 1 and Number 2 are Equal and also Largest");
		} else if (num1 == num3 && num1 > num2) {
			System.out.println("Number 1 and Number 3 are Equal and also Largest");
		} else if (num2 == num3 && num2 > num1) {
			System.out.println("Number 2 and Number 3 are Equal and also Largest");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println("The Largest Number is : " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("The Largest Number is : " + num2);
			} else {
				System.out.println("The Largest Number is : " + num3);
			}
		}
	}

}
