/*1.Write a Java Program to Complete below
 Requirements
-> Take 4 instance methods as addition,substraction , multiplication, division
 with two parameters in each method with out return type.
->call the only one method in main and pass two arguments that match method signature 
and perform arithmetic operation with arguments and print the results.
*/
package com.labpractice;

import java.util.Scanner;

public class Operations {
	
	void addition(int a , int b) {
		int c = a+b;
		System.out.println("Addition of a and b : "+c);
		sub(a, b);
	}
	void sub(int a, int b) {
		System.out.println("Subtraction of a and b : "+(a-b));
		mul(a, b);
	}
	void mul(int a,int b) {
		int c = a*b;
		System.out.println("Multiplication of a and b : "+c);
		division(a, b);
	}
	void division(int a,int b) {
		System.out.println("Division of a and b : "+(a/b));
	}

	 void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter a value of b : ");
		int b = sc.nextInt();
		
		addition(a,b);
		sc.close();
	}

}
