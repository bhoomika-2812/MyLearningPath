package com.langfundamentals;

public class TestDataTypesDemoObj2 {

	public static void main(String[] args) {
		// == operator checks the value if the data is primitive.
		//but if the data is object data type it checks the address of the object.
		// wrapper changing: 
		// if the data is b/w -128 to 127 then it allocates same memory so we will get true
		Integer i = 100;
		Integer i1 = 100;
		System.out.println(i==i1);
		//if the data is more than 127 then it allocates different memory for new values so we will get false
		Integer i2 = 200;
		Integer i3 = 200;
		System.out.println(i2==i3);
		
		
		//converting primitive to wrapper object data will consider as auto boxing
		Integer i4 = 10;
		//before auto boxing use this like internally
		//Integer i4 = Integer.valueOf(10);
		System.out.println(i4);
		
		// converting wrapper object data  to primitive data will consider as auto-unboxing
		int i5 = i4;
		//before auto- unboxing use this like
		//int i5 = i4.intValue();
		System.out.println(i5);
		
	}

}
