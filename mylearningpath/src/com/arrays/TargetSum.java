package com.arrays;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size : ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter a Elements : ");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter a target value : ");
		int target = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("(" + nums[i] + "," + nums[j] + ")");
				}
			}
		}
		sc.close();
	}

}
