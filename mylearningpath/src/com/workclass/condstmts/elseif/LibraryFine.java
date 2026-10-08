package com.workclass.condstmts.elseif;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Late Days : ");
		int days = sc.nextInt();
		if (days > 30) {
			System.out.println("Membrship Cancelled");
		} else if (days > 15 && days <= 30) {
			System.out.println("Your fine 100 rupees");
		} else if (days >= 8 && days <= 15) {
			System.out.println("Your fine 50 rupees");
		}else if(days >=1 && days <= 7){
			System.out.println("Your fine 20 rupees");
		}else {
			System.out.println("No fine");
		}
		sc.close();
	}

}
