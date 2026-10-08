package com.labpractice;

public class Product {
	
	int proId;
	String proName;
	int price;
	String proInfo;
	
	static String companyName="Vivo";
	{
		System.out.println("Company Name : "+companyName);
	}
	
	void show(int i,String n,int p,String in) {
		System.out.println("Pro Id : " + i + " , " + "Pro name : "  + n + "Price : " + p + " , " + "Info : " + in);
	}

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.show(101,"Vivo V40",34999,"8 GB Ram");
		Product p2 = new Product();
		p2.show(102,"Vivo T3",19999,"6 GB Ram");
		Product p3 = new Product();
		p3.show(102,"Vivo V30",32999,"8 GB Ram");
	}

}
