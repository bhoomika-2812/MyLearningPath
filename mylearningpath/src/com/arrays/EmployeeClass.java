package com.arrays;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	String city;
	
	Employee(int id, String name, String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
}

public class EmployeeClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int n = sc.nextInt();
		Employee a[] = new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter a id : ");
			int id = sc.nextInt();
			System.out.println("Enter a Name : ");
			String name = sc.next();
			System.out.println("Enter City : ");
			String city = sc.next();
			a[i] = new Employee(id,name,city);
		}
		for(Employee details : a) {
			System.out.println(details.id + " " + details.name + " " + details.city);
		}
		sc.close();
	}

}
