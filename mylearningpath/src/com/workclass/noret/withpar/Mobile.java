package com.workclass.noret.withpar;

import java.util.Scanner;

public class Mobile {
	void setBrandName(String brand) {
		System.out.println("Brand Name : "+brand);
	}
	void setVolLev(byte vol) {
		System.out.println("Volume Level is : "+vol);
	}
	void setManYear(short year) {
		System.out.println("Manufacture Year is : "+year);
	}
	void setStorage(int storage) {
		System.out.println("Mobile Storage : "+storage);
	}
	void setMobile(long mob) {
		System.out.println("Mobile Number : "+mob);
	}
	void setPercentage(float perc) {
		System.out.println("Battery Percentage : "+perc);
	}
	void setPrice(double price) {
		System.out.println("Mobile Price : "+price);
	}
	void setSimType(char type) {
		System.out.println("Sim Type : "+type);
	}
	void set5GStatus(boolean status) {
		System.out.println("5G Available : "+status);
	}
	void setModelNumber(Integer no) {
		System.out.println("Model Number(Id) : "+no);
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand Name :");
		String brand = sc.next();
		System.out.println("Enter Volume Level : ");
		byte vol = sc.nextByte();
		System.out.println("Enter Manufacture Year : ");
		short year = sc.nextShort();
		System.out.println("Enter Storage : ");
		int storage = sc.nextInt();
		System.out.println("Enter Mobile No : ");
		long mob = sc.nextLong();
		System.out.println("Enter Battery Percentage : ");
		float perc = sc.nextFloat();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter sim type : ");
		char type = sc.next().charAt(0);
		System.out.println("Is 5G Available? : ");
		boolean ava = sc.nextBoolean();
		System.out.println("Enter Mobile ID : ");
		Integer no = sc.nextInt();
		setBrandName(brand);
		setVolLev(vol);
		setManYear(year);
		setStorage(storage);
		setMobile(mob);
		setPercentage(perc);
		setPrice(price);
		setSimType(type);
		set5GStatus(ava);
		setModelNumber(no);
		sc.close();
	}

}
