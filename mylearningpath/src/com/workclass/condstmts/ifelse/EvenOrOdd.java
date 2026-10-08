package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("Your Number is " + number + " Even");
		}
		else {
			System.out.println("Your Number is " + number + " Odd");
		}
		sc.close();
	}

}
