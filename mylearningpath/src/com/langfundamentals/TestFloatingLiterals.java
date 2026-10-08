package com.langfundamentals;

public class TestFloatingLiterals {

	public static void main(String[] args) {
		
		//Floating Literals..
		float f1 = 123;
		//float f2 = 123.5; // invalid (Type mismatch: cannot convert from double to float)
		float f2 = 0123;
		float f3 = 0123.5f;
		float f4 = 0123f;
		float f5 = 123f;
		float f6 = 0x123;
		float f7 = 0x123f;
		//float f8 = 0x123.5f (Invalid hex literal number)
		
		//Double Literals..
		double d1 = 123d;
		double d2 = 123.5;
		double d3 = 0123;
		double d4 = 0123.5f;
		double d5 = 0123f;
		//double d6 = 123a; (Syntax error on token "a", delete this token)
		double d6 = 0x123;
		double d7 = 0x123f;
		//double d8 = 0x123.5f; (Invalid hex literal number)
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(d1);
		System.out.println("Double Result");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
	}

}
