package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class PizzaShare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Pizzas : ");
		int pizzas = sc.nextInt();
		System.out.println("Enter Number Of Friends : ");
		int friends = sc.nextInt();
		int total_slices = 8 * pizzas;
		if(total_slices > friends) {
			System.out.println("Total Available Slices : " + total_slices);
			System.out.println("Everyone gets a slice!");
		}
		else {
			System.out.println("Total Available Slices : " + total_slices);
			System.out.println("Not enough slices! Someone will miss out.");
		}
		sc.close();

	}

}
