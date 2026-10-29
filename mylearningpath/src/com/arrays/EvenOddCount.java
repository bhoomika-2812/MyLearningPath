//1.Write a Java program to count even and odd elements in an array.
package com.arrays;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int size = sc.nextInt();
		int [] elements = new int[size];
		System.out.println("Enter a Elements : ");
		for(int i=0;i<elements.length;i++) {
			elements[i] = sc.nextInt();
		}
		int ec=0;
		int oc=0;
		for(int ele : elements) {
			if(ele%2==0) {
				ec+=1;
			}else {
				oc+=1;
			}
		}
		System.out.println("Even Elements Count : " + ec);
		System.out.println("Odd Elements Count : " + oc);
		sc.close();
	}

}
