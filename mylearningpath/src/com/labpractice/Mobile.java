package com.labpractice;

public class Mobile {
	
	static String brand = "Vivo Brand Mobiles";
	String model;
	int price;
	String ram;
	
	static {
		System.out.println("Welcome to the Vivoo Store Guyss!!!");
	}
	{
		System.out.println("Here are the Vivo Modelss");
	}
	static void displayBrand() {
		System.out.println("Brand Name : " + brand);
	}
	
	void displayMobileDetails(String m, int p,String r) {
		System.out.println("Model : " + m);
		System.out.println("Price : " + p);
		System.out.println("Ram : " + r);
		
	}

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		System.out.println("Model 1");
		m1.displayMobileDetails("Vivo V40", 38999,"8 GB" );
		Mobile m2 = new Mobile();
		System.out.println("Model 2");
		m2.displayMobileDetails("Vivo V30", 34999,"6 GB" );
		Mobile m3 = new Mobile();
		System.out.println("Model 3");
		m3.displayMobileDetails("Vivo V20", 28999,"8 GB" );

	}

}
