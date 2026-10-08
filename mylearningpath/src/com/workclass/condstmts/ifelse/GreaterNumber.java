package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter Value of b : ");
		int b = sc.nextInt();
//		if(a == b) {
//			System.out.println("They are Equal");
//		}
		if(a > b) {
			System.out.println(a + " is Greater");
		}
		else {
			System.out.println(b + " is greater");
		}
		sc.close();
	}

}
