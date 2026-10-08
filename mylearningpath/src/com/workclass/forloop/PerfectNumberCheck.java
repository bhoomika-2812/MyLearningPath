package com.workclass.forloop;

import java.util.Scanner;

public class PerfectNumberCheck {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number : ");
//		int n = sc.nextInt();
//		boolean status = isPerfect(n);
//		if (status) {
//			System.out.println(n + " is a Perfect Number");
//		} else {
//			System.out.println(n + " is not a Perfect Number");
//		}
//		sc.close();
//	}
//
//	public static boolean isPerfect(int n) {
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				sum = sum + i;
//			}
//			if (sum == n) {
//				return true;
//			}
//		}
//		return false;
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number : ");
//		int n = sc.nextInt();
//		boolean status = isPerfect(n);
//		if (status) {
//			System.out.println(n + " is a Perfect Number");
//		} else {
//			System.out.println(n + " is not a Perfect Number");
//		}
//		sc.close();
//	}
//
//	public static boolean isPerfect(int n) {
//		boolean status = false;
//		int sum = 0;
//		for (int i = 1; i <= n / 2; i++) {
//			if (n % i == 0) {
//				sum = sum + i;
//			}
//		}
//		if (sum == n) {
//			status = true;
//		}
//		return status;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if (isPerfect(n) == n) {
			System.out.println(n + " is a Perfect Nmber");
		} else {
			System.out.println(n + " is not a Perfect Number");
		}
		sc.close();
	}

	public static int isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;

	}

}
