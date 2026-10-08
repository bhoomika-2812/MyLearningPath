package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class NumberComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int fn = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int sn = sc.nextInt();
		if (fn == sn) {
			System.out.println("Both Numbers are Equal");
		} else if (fn > sn) {
			System.out.println("First Number is Greater");
		} else {
			System.out.println("Second Number is Greater");
		}
		sc.close();
	}

}
