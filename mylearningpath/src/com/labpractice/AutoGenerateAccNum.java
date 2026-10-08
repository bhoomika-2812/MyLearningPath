package com.labpractice;

public class AutoGenerateAccNum {
	
	static int accno = 0;
	String name;
	int sal;
	boolean accStatus;
	
	{
		accno++;
	}
	
	void displayAccountDetails(String n,int s,boolean as) {
		System.out.println("Account Number : " +accno);
		System.out.println("Name : " +n);
		System.out.println("Salary : " +s);
		System.out.println("Account Status : " +as);
	}

	public static void main(String[] args) {
		
		AutoGenerateAccNum a1 = new AutoGenerateAccNum();
		System.out.println("Account 1 Details");
		a1.displayAccountDetails("Bhoomika",85000,true);
		AutoGenerateAccNum a2 = new AutoGenerateAccNum();
		System.out.println("Account 2 Details");
		a2.displayAccountDetails("Asmithaa",75000,false);
		AutoGenerateAccNum a3 = new AutoGenerateAccNum();
		System.out.println("Account 3 Details");
		a3.displayAccountDetails("Sowjii",80000,true);

	}

}
