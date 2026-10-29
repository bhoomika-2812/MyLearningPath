package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdArrayFromTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A-array Size : ");
		int n = sc.nextInt();
		System.out.println("Enter B-array Size : ");
		int m = sc.nextInt();
		
		int [] a = new int[n];
		int [] b = new int[m];
		
		System.out.println("Enter A-array elements : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter B-Array elements : ");
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		System.out.println(Arrays.toString(c));
		sc.close();
	}

}
