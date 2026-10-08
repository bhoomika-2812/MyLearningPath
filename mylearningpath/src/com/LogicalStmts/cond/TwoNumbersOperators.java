package com.LogicalStmts.cond;

import java.util.Scanner;

public class TwoNumbersOperators {

	public static void main(String[] args) {
		System.out.println("Operators Concept");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter First Number : ");
			int f1 = sc.nextInt();
			System.out.println("Enter Second Number : ");
			int f2 = sc.nextInt();
			System.out.println("Enter Operators Like + - * / % : ");
			String symbol = sc.next();
			switch (symbol) {
			case "+" -> System.out.println("Sum of Two Numbers : " + (f1 + f2));
			case "-" -> System.out.println("Diff of Two Numbers : " + (f1 - f2));
			case "*" -> System.out.println("Product of Two Numbers : " + (f1 * f2));
			case "/" -> System.out.println("Quotient of Two Numbers : " + (f1 / f2));
			case "%" -> System.out.println("Remainder of Two Numbers : " + (f1 % f2));
			default -> System.out.println("Invalid Operator");
			}
			System.out.println("Do you want to Continue..? Click Y for Yes or Click N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("You clicked for EXIT !!");
	}

}
