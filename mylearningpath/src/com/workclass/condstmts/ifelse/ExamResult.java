package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks : ");
		int marks = sc.nextInt();
		if(marks >= 35) {
			System.out.println("Pass..Congratss and all the best");
		}
		else {
			System.out.println("Fail..Improve your studies");
		}
		sc.close();
	}

}
