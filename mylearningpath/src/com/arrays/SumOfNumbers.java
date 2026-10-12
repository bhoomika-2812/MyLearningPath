package com.arrays;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();

//		step 1 & 2: declaration and creation
		int ele[] = new int[size];

//		step 3 : Initialization
		System.out.println("Enter a Values: ");
		for (int i = 0; i < size; i++) {
			ele[i] = sc.nextInt();
		}

//		step 4 : Representation
		int sum = 0;
		for (int val : ele) {
			sum = sum + val;
		}
		System.out.println("Sum Of the Values : "+sum);
		sc.close();
	}

}
