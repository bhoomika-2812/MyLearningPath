package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class AttendanceWarning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Attendance Percentage : ");
		float attendance_per = sc.nextFloat();
		if(attendance_per > 65.0) {
			System.out.println("You are Eligible to Write Exams");
		}
		else {
			System.out.println("You are not Eligible to Write Exams");
			System.out.println("Call Your Parents");
		}
		sc.close();
	}

}
