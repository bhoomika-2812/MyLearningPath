package com.warningwork;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a Number 1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter a Number 2 : ");
			int num2 = sc.nextInt();
			System.out.println("Enter Operator : ");
			String operators = sc.next();
			switch (operators) {
			case "+" -> {
				System.out.println("Result of Num1 and Num2 is " + (num1 + num2));
			}
			case "-" -> {
				System.out.println("Result of Num1 and Num2 is " + (num1 - num2));
			}
			case "*" -> {
				System.out.println("Result of Num1 and Num2 is " + (num1 * num2));
			}
			case "/" -> {
				System.out.println("Result of Num1 and Num2 is " + (num1 / num2));
			}
			case "%" -> {
				System.out.println("Result of Num1 and Num2 is " + (num1 % num2));
			}
			default -> System.out.println("Entered Operator is not Valid..!!");
			}
			System.out.println("Do you Want to Continue Calculation then Click Y, otherwise N");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("Please You Can Exit..!!");

	}

}
