package com.workclass.noret.nopar;

public class FunMethods {
	
	static void sayHello() {
		System.out.println("Haii Helloooooo");
		sayGM();
	}
	public static void sayGM() {
		System.out.println("Good Morninggg Guyssss");
		FunMethods.sayGE();
	}
	static void sayGE() {
		System.out.println("Good Evening");
		disWelMes();
	}
	public static void disWelMes() {
		System.out.println("Welcome to my world");
		FunMethods.disDate();
	}
	static void disDate() {
		System.out.println("26-08-2026");
		FunMethods f = new FunMethods();
		f.disTime();
	}
	void disTime() {
		System.out.println("3:30 pm");
		disFavCol();
	}
	public void disFavCol() {
		System.out.println("My fav colour is BLACK");
		disFood();
	}
	void disFood() {
		System.out.println("My fav food is Biryanii.. Yummmyyyyy");
		disFavGame();
	}
	public void disFavGame() {
		System.out.println("My fav game is Cricket");
		disMyDetails();
	}
	void disMyDetails() {
		System.out.println("My Name is Bhoomika... I am 21 years Old... My Goal is to become a Java Developer");
	}

	public static void main(String[] args) {
		FunMethods.sayHello();
	}

}
