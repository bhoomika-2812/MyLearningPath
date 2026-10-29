package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Size : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter First Array Elements : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Second Array Size : ");
		int m = sc.nextInt();
		int[] b = new int[m];
		System.out.println("Enter Second Array Elements : ");
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		int max_len = Math.max(a.length, b.length);
		int[] c = new int[max_len];
		
		for(int i=0;i<max_len;i++) {
			int x=0;
			int y=0;
			if(i<a.length) {
				x = a[i];
			}
			if(i<b.length) {
				y=b[i];
			}
			c[i] = x+y;
		}
		System.out.println(Arrays.toString(c));
		sc.close();
	}

}
