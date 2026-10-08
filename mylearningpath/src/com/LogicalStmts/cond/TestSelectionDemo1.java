package com.LogicalStmts.cond;

import java.util.Scanner;

public class TestSelectionDemo1 {

	public static void main(String[] args) {
		System.out.println("Welcome to Cricketer Team..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Jersey Number : ");
		int jno = sc.nextInt();
		switch(jno) {
		case 7:
			System.out.println("MS.Dhoni");
			System.out.println("Good Cricketer");
			break;
		case 18:
			System.out.println("Virat Kohli");
			System.out.println("Consistent Player");
			break;
		case 45:
			System.out.println("Rohith Sharma");
			System.out.println("Good Captain");
			break;
		default:
			System.out.println("Entered jersey number is not valid");
		}
		sc.close();
	}

}
