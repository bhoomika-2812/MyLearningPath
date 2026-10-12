package com.arrays;

import java.util.Scanner;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class StudentClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		Student a[] = new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			System.out.println("Enter a Name : ");
			String name = sc.next();
			a[i] = new Student(id,name); 
		}
		for(Student s : a) {
			System.out.println(s.id + " " + s.name);
		}
		sc.close();
	}

	
}
