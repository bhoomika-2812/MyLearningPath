/*Java
1.Create a Java program to calculate a Student Grade based on marks.
Requirements
Ask the user to enter marks.
Calculate the grade using if-else 
90–100 → A
75–89 → B
60–74 → C
40–59 → D
Below 40 → Fail
Output
Display the marks and corresponding grade.
Note: Handle invalid marks (below 0 or above 100).*/
package com.labpractice;

import java.util.Scanner;

public class StudentGradeLS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		if (marks > 100 || marks < 0) {
			System.out.println("Invalid Marks...");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("Grade A");
		} else if (marks >= 75 && marks < 90) {
			System.out.println("Grade B");
		} else if (marks >= 60 && marks < 75) {
			System.out.println("Grade C");
		} else if (marks >= 40 && marks < 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}
		sc.close();
	}

}
