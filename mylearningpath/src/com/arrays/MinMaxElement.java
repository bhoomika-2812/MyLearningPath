package com.arrays;

import java.util.Scanner;

public class MinMaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a size : ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter a numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

//		for loop
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

//		Enhanced for loop or for each loop
//		for(int a : arr) {
//			if(a<min) {
//				min = a;
//			}else if(a>max) {
//				max=a;
//			}
//		}
		System.out.println("Minimum Element : " + min);
		System.out.println("Maximum Element : " + max);
	}

}
