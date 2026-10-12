package com.arrays;

import java.util.Scanner;

class Car {
	int cid;
	String cname;
	double price;

	Car(int cid, String cname, double price) {
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}
}

public class CarClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		Car c[] = new Car[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Car Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Car name : ");
			String name = sc.next();
			System.out.println("Enter Car Price : ");
			double price = sc.nextDouble();
			c[i] = new Car(id, name, price);
		}
		for (Car details : c) {
			System.out.println(details.cid + " " + details.cname + " " + details.price);
		}
		sc.close();
	}

}
