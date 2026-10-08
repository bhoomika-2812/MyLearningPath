package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class GreatestofThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int fn = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int sn = sc.nextInt();
		System.out.println("Enter Third Number : ");
		int tn = sc.nextInt();
		if (fn == sn && sn == tn) {
			System.out.println("All Numbers are Equal");
		} else if (fn == sn && fn > tn) {
			System.out.println("First and Second are equal also greatest");
		} else if (fn == tn && fn > sn) {
			System.out.println("First and Third are equal also greatest");
		} else if (sn == tn && sn > fn) {
			System.out.println("Second and Third are equal also greatest");
		} else if (fn > sn && fn > tn) {
			System.out.println("First Number is Greatest");
		} else {
			if (sn > tn) {
				System.out.println("Second Number is Greatest");
			} else {
				System.out.println("Third Number is Greatest");
			}
		}
		sc.close();
	}

}
