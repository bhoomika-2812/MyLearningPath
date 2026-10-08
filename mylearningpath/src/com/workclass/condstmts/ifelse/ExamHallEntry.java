package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class ExamHallEntry {

	public static void main(String[] args) {
		float min_per = 65.0f;
		double fee_status = 10000.00;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Attendance Percentage : ");
		float atten_per = sc.nextFloat();
		System.out.println("Enter Fee Payment : ");
		double fee = sc.nextDouble();
		if(atten_per >= min_per && fee <= fee_status) {
			System.out.println("You are eligible to enter the exam hall");
		}
		else {
			System.out.println("You are not eligible");
		}
		sc.close();
	}

}
