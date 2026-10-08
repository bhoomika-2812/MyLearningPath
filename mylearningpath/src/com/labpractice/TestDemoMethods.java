package com.labpractice;

public class TestDemoMethods {
	
	static void m1() {
		System.out.println("Method 1 called");
		TestDemoMethods t = new TestDemoMethods();
		t.m2();
	}
	void m2() {
		m3();
		System.out.println("Method 2 Called");
	}
	static void m3() {
		System.out.println("Method 3 Called");
		TestDemoMethods t = new TestDemoMethods();
		t.m4();
	}
	void m4() {
		m5();
		System.out.println("Method 4 Called");
	}
	static void m5() {
		System.out.println("Method 5 Called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		m1();
		System.out.println("Main Method Ended");
	}

}
