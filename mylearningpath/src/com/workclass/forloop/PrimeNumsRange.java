package com.workclass.forloop;

import java.util.Scanner;

public class PrimeNumsRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			if(primeRange(i)==1) {
				System.out.println(i + " ");
			}
		}
		sc.close();
	}
	static int primeRange(int n) {
		int c =0;
		for(int i = 1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return 1;
		}
		return 0;
	}

}
