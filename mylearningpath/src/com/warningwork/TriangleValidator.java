package com.warningwork;

import java.util.Scanner;

public class TriangleValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter angle 1 : ");
		int a1 = sc.nextInt();
		System.out.println("Enter angle 2 : ");
		int a2 = sc.nextInt();
		System.out.println("Enter angle 3 : ");
		int a3 = sc.nextInt();
		checkTriangle(a1, a2, a3);
		sc.close();
	}

	public static void checkTriangle(int a1, int a2, int a3) {
		int sum = a1 + a2 + a3;
		if (a1 <= 0 || a2 <= 0 || a3 <= 0 || sum != 180) {
			System.out.println("Invalid Triangle");
		} else if (a1 == 90 || a2 == 90 || a3 == 90) {
			System.out.println("Valid Triangle");
			System.out.println("Right Angled Trianngle");
		} else if (a1 > 90 || a2 > 90 || a3 > 90) {
			System.out.println("Valid Triangle");
			System.out.println("Obtuse Triangle");
		} else {
			System.out.println("Valid Triangle");
			System.out.println("Acute Triangle");
		}
	}

}
