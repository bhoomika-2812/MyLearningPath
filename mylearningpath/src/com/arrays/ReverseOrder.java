//Write a Java program to print array elements in reverse order.
package com.arrays;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int size = sc.nextInt();
		int[] elements = new int[size];
		System.out.println("Enter a Elements : ");
		for(int i=0;i<size;i++) {
			elements[i]=sc.nextInt();
		}
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(elements[i]+ " ");
		}
		
		sc.close();
	}

}
