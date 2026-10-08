package com.workclass.noret.withpar;

import java.util.Scanner;

public class Product {
	void setProName(String name) {
		System.out.println("Product Name : "+name);
	}
	void setQuantity(byte qua) {
		System.out.println("Product Quantity : "+qua);
	}
	void setManYear(short year) {
		System.out.println("Manufacture Year : "+year);
	}
	void setProId(int id) {
		System.out.println("Product Id : "+id);
	}
	void setBarCode(long barcode) {
		System.out.println("Barcode Number : "+barcode);
	}
	void setDiscount(float per) {
		System.out.println("Discount : "+per+"%");
	}
	void setPrice(double price) {
		System.out.println("Price : "+price);
	}
	void setProGrade(char grade) {
		System.out.println("Product Grade : "+grade);
	}
	void setAvailable(boolean status) {
		System.out.println("Product Available : "+status);
	}
	void setProNumber(Integer number) {
		System.out.println("Product Number : "+number);
	}

	public static void main(String[] args) {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Quantity : ");
		byte qua = sc.nextByte();
		System.out.println("Enter manufacture year : ");
		short year = sc.nextShort();
		System.out.println("Enter Product Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Barcode Number : ");
		long barcode = sc.nextLong();
		System.out.println("Enter Discount Percentage : ");
		float per = sc.nextFloat();
		System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Product Grade : ");
		char grade = sc.next().charAt(0);
		System.out.println("Is Product Available? : ");
		boolean ava = sc.nextBoolean();
		System.out.println("Enter Product Number : ");
		Integer number = sc.nextInt();
		p.setProName(name);
		p.setQuantity(qua);
		p.setManYear(year);
		p.setProId(id);
		p.setBarCode(barcode);
		p.setDiscount(per);
		p.setPrice(price);
		p.setProGrade(grade);
		p.setAvailable(ava);
		p.setProNumber(number);
		sc.close();

	}

}
