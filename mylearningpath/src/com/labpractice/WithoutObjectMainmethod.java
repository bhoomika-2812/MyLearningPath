package com.labpractice;

public class WithoutObjectMainmethod {
	
	static {
		WithoutObjectMainmethod t = new WithoutObjectMainmethod();
		t.m5();
	}
	
	static void m1() {
		System.out.println("M1 Called");
		m2();
		
	}
	
	static void m2() {
		System.out.println("M2 Called");
		m3();
	}
	
	static void m3() {
		m4();
		System.out.println("M3 Called");
	}
	
	static void m4() {
		System.out.println("M4 Called");
	}
	
	void m5() {
		System.out.println("M5 Called");
		m6();
	}
	
	void m6() {
		m7();
		System.out.println("M6 Called");
	}
	
	void m7() {
		System.out.println("M7 Called");
		m8();
	}
	
	void m8() {
		System.out.println("M8 Called");
		m1();
	}

	public static void main(String[] args) {
		
	}
}
