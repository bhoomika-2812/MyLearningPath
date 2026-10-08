package com.langfundamentals;

public class TestDataTypesDemoPri1 {
	
	//more than 127 is not possible
	// by default rhs numeric values are int values
	// more than 128 gives compile time error : Type mismatch: cannot convert from int to byte
	byte b =127;
	byte b1 = (byte) 130;  // int to byte conversion (explicit type casting)
	
	// short range -32768 to 32767
	short s = 32767;
	short s1 = (short) 32768;  // int to short conversion (explicit type casting)
	
	// int range -2147483648 to 2147483647
	int i = 2147483647;
  //int i1 = 2147483648; 
	
	// long range -9223372036854775808 to 9223372036854775807
	long l = -9223372036854775808l;
//	long l1 = 9223372036854775809l;
	long l2 = i;
	int l3 = (int)l;
	
	float f = 75.54f;
	double d = 23948.58394;
	
	float f1 = 8747898938792832849f;
	double d1 = 457823884387928301.83;
	
	// char range 0 to 65535
	//65 to 90 ---> A to Z and 91 to 96 ----> special characters and 97 to 122 ---> a to z
	char c= 'A';
	int c1 = (int)c;
	char c2 = 99;
	char c3 = 94;
	
	boolean boo = true;
	
	public static void main(String[] args) {
		
		TestDataTypesDemoPri1 t = new TestDataTypesDemoPri1();
		
		// Jvm will provide default values
		// for numbers it is like "zero's"
		// for decimal point data it is like "0.0"
		// for single character it is "space"
		// for boolean it is "false"
		
		System.out.println(t.b);
		System.out.println(t.b1);
		System.out.println(t.s);
		System.out.println(t.s1);
		System.out.println(t.i);
		System.out.println(t.l);
		System.out.println(t.l2);
		System.out.println(t.l3);
		
		System.out.println(t.f);
		System.out.println(t.d);
		
		System.out.println(t.f1);
		System.out.println(t.d1);
		
		System.out.println(t.c);
		System.out.println(t.c1);
		System.out.println(t.c2);
		System.out.println(t.c3);
		if(t.boo) {
			System.out.println("Haii Bhoom");
		}
		System.out.println(t.boo);
	}

}
