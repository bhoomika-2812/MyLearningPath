/*2.Write a Java program to declare and display variables using the following literals:
	Integer literal
	Floating-point literal
	Character literal
	String literal
	Boolean literal*/
package com.labpractice;

public class LiteralsAll {

	public static void main(String[] args) {
		// Integral literals
		// decimal literals --> base 10 --> 0 to 9
		int i0 = 00;
		int i1 = 1234;
		// octal literals --> base 8 --> 0 to 8
		int i2 = 0023;
		int i3 = 0765;
		// hexa decimal --> base 16 --> 0 to 9 & a to f & A to F
		int i4 = 0x123;
		int i5 = 0xabcdef;
		// binary --> base 2 --> 0,1
		int i6 = 0b010101;
		int i7 = 0b11100111;

		System.out.println(i0);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);

		// Floating-point literals
		float f1 = 0123.5f;
		float f2 = 1234;
		float f3 = 0x123f;// f is considered as hexadecimal value not as float

		double d1 = 1234;
		double d2 = 1234.678;
		double d3 = 0x123d;// d is considered as hexadecimal value not as double

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		// Character literal
		char a = 'A';
		char b = 65;
		char c = '\u0040';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// String literal
		String s1 = "Bhoomi";
		String s2 = new String("Java");
		System.out.println(s1);
		System.out.println(s2);

		// Boolean literal
		Boolean b1 = true;
		Boolean b2 = false;
		if (b1) {
			System.out.println("b1 if executed");
		} else {
			System.out.println("b1 else");
		}
		if (b2) {
			System.out.println("b2 if executed");
		} else {
			System.out.println("b2 else executed");
		}
	}

}
