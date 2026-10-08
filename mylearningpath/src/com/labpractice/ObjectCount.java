package com.labpractice;

public class ObjectCount {

	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {

		ObjectCount o1 = new ObjectCount();
		ObjectCount o2 = new ObjectCount();
		ObjectCount o3 = new ObjectCount();
		ObjectCount o4 = new ObjectCount();
		ObjectCount o5 = new ObjectCount();

		System.out.println(count);
	}
}
