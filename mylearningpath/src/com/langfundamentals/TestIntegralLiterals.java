package com.langfundamentals;

public class TestIntegralLiterals {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		// Decimal literals..
		//Any natural numbers will consider as Decimal.
		// Decimal literals base is 10 : 0 to 9
		int a1 = 123;
		int a2 = 1230;
		int a3 = 00;
		
		//Octal Literals...
		//Any number start with 0 will consider as Octal.
		//Octal literal base is 8 : 0 to 7
		int a4 = 0123;
		int a5 = 0456;
		int a6 = 0676;
		//int a7 = 0786; // Invalid (The literal 0786 of type int is out of range)
		
		//Hexa-Decimal Literals...
		//Any number starts with 0X or 0x will consider as hexa-decimal.
		//Hexa-Decimal base value is 16 : 0 to 9 & a to f / A to F
		int a7 = 0X123;
		int a8 = 0xabc;
		int a9 = 0xaab123;
		int a10 = 0Xbee;
		//int a11 = 0xbeer; invalid
		
		//Binary Literals...
		//Any number starts with 0b or 0B will consider as binary.
		//Binary literal base value is 2 : 0 to 1
		int a11 = 0b101;
		int a12 = 0B001;
		int a13 = 0B11100111;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		
		System.out.println("Main method ended");

	}

}
