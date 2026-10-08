package com.langfundamentals;

public class TestCharBooleanStringNullLiterals {

	public static void main(String[] args) {
		
		//Char Literals..
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0040';
		char c4 = '\ufafa';
		
		//Boolean Literals..
		// only we can take true or false
		boolean b = true;
		if(b) {
			System.out.println("Haii");
		}
		else {
			System.out.println("Nothing");
		}
		
		//String Literals..
		String s = "Bhoomi"; // string literals store in scp only one time in scp
		String s1 = new String("Bhoomika"); // string objects stores in heap two times one is scp and other one heap
		
		//Null Literals..
		String animal = null;
		animal = new String("Elephant");
		
		Integer i = null;
		//i = new Integer(123);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(animal);
		System.out.println(i);
		

	}

}
