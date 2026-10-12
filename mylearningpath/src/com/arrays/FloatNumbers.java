package com.arrays;

import java.util.Scanner;

public class FloatNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		float arr[] = new float[n];
		System.out.println("Enter a Values : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextFloat();
		}
		for(float val : arr) {
			System.out.println(val);
		}
		sc.close();
	}

}
