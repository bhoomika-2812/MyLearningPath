package com.arrays;

import java.util.Scanner;

public class PosNegCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();
		int[] elements = new int[size];
		System.out.println("Enter a Elements : ");
		for(int i=0;i<size;i++) {
			elements[i] = sc.nextInt();
		}
		int pc=0;
		int nc=0;
		for(int ele : elements) {
			if(ele>0) {
				pc+=1;
			}else {
				nc+=1;  
			}
		}
		System.out.println("Positive Elements Count : " + pc);
		System.out.println("Negative Elements Count : " + nc);
		sc.close();
	}

}
