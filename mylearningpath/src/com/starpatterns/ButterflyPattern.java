//package com.starpatterns;
//
//import java.util.Scanner;
//
//public class ButterflyPattern {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Size of Pattern : ");
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= n - 1; i++) {
//			for (int j = n - 1; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//			for (int i = 1; i <= n; i++) {
//				for (int j = n; j > i; j--) {
//					System.out.print(" ");
//				}
//				for (int k = 1; k <= i; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//
//			for (int i = 1; i <= n - 1; i++) {
//				for (int j = 1; j <= i; j++) {
//					System.out.print(" ");
//				}
//				for (int k = n - 1; k >= i; k--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//		sc.close();
//	}
//
//}
