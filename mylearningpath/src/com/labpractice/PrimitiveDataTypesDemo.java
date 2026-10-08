/*1.Write a Java program to:
Create an int primitive variables
Convert it into an Integer object using autoboxing.
Convert the Integer object back into an int using autounboxing.
Display both values.*/

package com.labpractice;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		
		int i = 20;
		Integer i1 = i; //autoboxing
		int i2 = i1;  //auto-unboxing
		
		System.out.println(i1);
		System.out.println(i2);

	}

}
