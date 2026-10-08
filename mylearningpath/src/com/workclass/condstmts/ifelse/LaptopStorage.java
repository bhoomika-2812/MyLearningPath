package com.workclass.condstmts.ifelse;

import java.util.Scanner;

public class LaptopStorage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Free Storage (GB) : ");
		double free = sc.nextDouble();
		System.out.println("Enter Movie Size (GB) : ");
		double movie = sc.nextDouble();
		if(free > movie) {
			System.out.println("Download Successful! Enough space available.");
			System.out.println("Remaining Space (GB) : " + (free - movie));
		}else {
			System.out.println("Insufficient Space! Clear Some Files.");
			System.out.println("Remaining Space (GB) : " + free);
		}
		sc.close();
	}

}
