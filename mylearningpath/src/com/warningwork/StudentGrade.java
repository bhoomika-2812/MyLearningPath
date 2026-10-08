package com.warningwork;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sub1 Marks : ");
		int sub1 = sc.nextInt();
		System.out.println("Enter Sub2 Marks : ");
		int sub2 = sc.nextInt();
		System.out.println("Enter Sub3 Marks : ");
		int sub3 = sc.nextInt();
		System.out.println("Enter Sub4 Marks : ");
		int sub4 = sc.nextInt();
		System.out.println("Enter Sub5 Marks : ");
		int sub5 = sc.nextInt();
		grade(sub1, sub2, sub3, sub4, sub5);
		sc.close();
	}

	public static void grade(int sub1, int sub2, int sub3, int sub4, int sub5) {
		int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
		int maxmarks = 500;
		float percentage = ((float) totalmarks / maxmarks) * 100;
		System.out.println("Total Marks : " + totalmarks);
		System.out.println("Percentage : " + percentage);
		if (percentage > 100 || percentage <= 0) {
			System.out.println("Invalid");
		} else if (percentage >= 90 && percentage <= 100) {
			System.out.println("Grade : A");
		} else if (percentage >= 75 && percentage < 90) {
			System.out.println("Grade : B");
		} else if (percentage >= 60 && percentage < 75) {
			System.out.println("Grade : C");
		} else if (percentage >= 50 && percentage < 60) {
			System.out.println("Grade : D");
		} else {
			System.out.println("Grade : F");
		}
	}

}
