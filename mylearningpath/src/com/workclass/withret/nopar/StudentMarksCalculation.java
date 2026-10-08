package com.workclass.withret.nopar;

import java.util.Scanner;

public class StudentMarksCalculation {
	static Scanner sc = new Scanner(System.in);

	static int getMathsMarks() {
		System.out.println("Enter Maths Marks : ");
		int marks = sc.nextInt();
		return marks;
	}

	static int getScienceMarks() {
		System.out.println("Enter Science Marks : ");
		int marks = sc.nextInt();
		return marks;
	}

	static int getEnglishMarks() {
		System.out.println("Enter English Marks : ");
		int marks = sc.nextInt();
		return marks;
	}

	public static void main(String[] args) {
		int mathsMarks = getMathsMarks();
		int scienceMarks = getScienceMarks();
		int englishMarks = getEnglishMarks();
		System.out.println("Total Marks : " + (mathsMarks + scienceMarks + englishMarks));
	}

}
