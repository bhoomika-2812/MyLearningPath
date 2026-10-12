package com.arrays;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		step 1 : Array Declaration
		int[] a;

//		step 2 : Creation
		a = new int[n];

//		step 3 : Initialization
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

//		step 4 : Representation with for-each loop
//		for (int val : a) {
//			System.out.println(val);
//		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
