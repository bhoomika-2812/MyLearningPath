package com.starpatterns;

//*****
//****
//***
//**
//*

import java.util.Scanner;

public class RevLeftAngledTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of pattern : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
