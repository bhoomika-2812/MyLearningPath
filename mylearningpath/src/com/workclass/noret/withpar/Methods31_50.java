package com.workclass.noret.withpar;
import java.util.Scanner;

public class Methods31_50 {
	static void location(String location) {  //1
		System.out.println("location is"+location);
	}
	static void initial(String initial) {    //2
		System.out.println("entered  initial"+initial);
	}
	static void state(String state) {        //3
		System.out.println("the stateis:"+state);
	}
	static void street(String street) {     //4
		System.out.println("the street name is:"+street);
	}
	static void salary(double salary) {     //5
		System.out.println("the salary:"+salary);
	}
	static void favcolor(String color) {    //6
		System.out.println(" my fav color is:"+color);
	}
	 static void displayCollege(String college) {   //7
		 System.out.println(college);
	 }
	 static void displayCourse(String course) {  //8
		 System.out.println(course);
	 }
	 static void displayCountry(String country) {  //9
		 System.out.println(country);
	 }
	 static void displayNumber(int num) {   //10
		 System.out.println(num);
	 }
	 static void employeeName(String ename) {   //11
		 System.out.println(ename);
	 }
	 static void employeeRole(String role) {   //12
		 System.out.println(role);
	 }
	 static void showDay(int day) {   //13
		 System.out.println(day);
	 }
	 static void showMonth(int month) {   //14
		 System.out.println(month);
	 }
	 static void showYear(int year) {   //15
		 System.out.println(year);
	 }
	 static void showTime(double time) {   //16
		 System.out.println(time);
		 
	 }
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a msg");
		String msg=sc.next();
		System.out.println("enter the  name");
		String name=sc.next();
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter the location");
		String loc=sc.next();
		System.out.println("enter the initial");
		String ini=sc.next();
		System.out.println("enter the state");
		String state=sc.next();
		System.out.println("enter the steet");
		String street=sc.next();
		System.out.println("enter the salary");
		double salary=sc.nextDouble();
		System.out.println("enter your fav color");
		String color=sc.next();
		System.out.println("enter college name");
		String college=sc.next();
		System.out.println("enter the course");
		String course=sc.next();
		System.out.println("enter the country");
		String country=sc.next();
		System.out.println("enter the fav num");
		int num=sc.nextInt();
		System.out.println("enter the ename");
		String ename=sc.next();
		System.out.println("enter the role");
		String role=sc.next();
		System.out.println("enter the day");
		int day=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the time");
		double time=sc.nextDouble();
	
		state(state);
		displayMessage(msg);
		initial(ini);
		name(name);
		id(id);
		location(loc);
		salary(salary);
		favcolor(color);
		displayCollege(college);
		displayCourse(course);
		displayCountry(country);
		displayNumber( num);
		employeeName( ename);
		employeeRole( role);
		showDay(day);
		showMonth( month);
		showYear( year);
		showTime(time);

	}
	 static void displayMessage( String msg) {   //17
		 System.out.println("the msg is:"+msg);
		 
		 
	 }
	 static void name(String name) {     //18
		 System.out.println("entered name is:"+name);
	 }
	 static void id(int id) {   //19
		 System.out.println("the id is:"+id);
	 }
	 static void age(int age) {   //20
		 System.out.println("enter the age is"+age);
	 }
}