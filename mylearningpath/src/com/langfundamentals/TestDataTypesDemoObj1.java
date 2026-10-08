package com.langfundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

// a class itself is called the object..
class Dog {

}

public class TestDataTypesDemoObj1 {

	// Normal Obj data types
	String s = "Bhoomi"; // String literal is stored in scp (string constant pool)
	// and also here we can create object because of string contains no arg
	// constructor...
	String s1 = new String("Hiiii......"); // String objects are stored in heap memory

	// In BigInteger contains parameterized constructor so we want to create object
	// we need a constructor.
	// BigInteger bi = "72381273912830921803120938";
	BigInteger bi1 = new BigInteger("73287382139128390218093721632746324535432643827");
	BigInteger bi2 = new BigInteger("73287382139128390218093721632746324535432643827");

	BigDecimal bd1 = new BigDecimal("23723879.2381927381928232368238236");
	BigDecimal bd2 = new BigDecimal("23723879.2381927381928232368238236");

	// Wrapper Obj data types
	Integer i = 100; // we can store primitive to wrapper that process is auto-boxing
	Short sh ;
	Character ch;

	Dog d;

	public static void main(String[] args) {

		// the jvm prodived to all object data types default values is nullll........
		TestDataTypesDemoObj1 t1 = new TestDataTypesDemoObj1();

		System.out.println("String Values is : " + t1.s);
		System.out.println("String Object Value is : " + t1.s1);

		System.out.println();
		System.out.println("BigInteger Values is : " + t1.bi1);
		System.out.println("Additin of bi1 and bi2 is : " + t1.bi1.add(t1.bi2));
		System.out.println("Multiplication of bi1 and bi2 : " + t1.bi1.multiply(t1.bi2));
		
		System.out.println();
		System.out.println("BigDecimal Values is : " + t1.bd1);
		System.out.println("Addition of bd1 and bd2 is : " + t1.bd1.add(t1.bd1));
		System.out.println("Multiplication of bd1 and bd2 is : " + t1.bd1.multiply(t1.bd1));
		
		System.out.println();
		System.out.println("Integer Values is : " + t1.i);
		System.out.println("Short Values is : " + t1.sh);
		System.out.println("Character Values is : " + t1.ch);
		
		System.out.println();
		System.out.println("Dog Values is : " + t1.d);

	}

}
