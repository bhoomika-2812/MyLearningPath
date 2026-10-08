package com.workclass.noret.withpar;

import java.util.Scanner;

public class Methods11_30 {
	static void percentage(double percentage) {  //21
	System.out.println("the percentage"+percentage);
	}
	static void displayCgpa(double cgpa) {   //22
		System.out.println("the cgpa"+cgpa);
		
		
	}
	static void height(double height) {   //23
		System.out.println("the height"+height);
	}
	static void displayWeight(double weight) {  //24
		System.out.println("the weight"+weight);
		
	}
	static void displayGrade(char grade) {  //25
		System.out.println("the grade"+grade);
		
	}
	 static void displayCharacter(char chara) {  //26
		 System.out.println("the character"+chara);
	 }
	  static void printSymbol(char symbol) {  //27
		  System.out.println("the symbol"+symbol);
		  
	  }
	  static void showVowel(char vow) {  //28
		  System.out.println("the vowel"+vow);
	  }
	  static void ascii(char asci) {  //29
		  System.out.println("the ascii character"+asci);
	  }
	  static void yes(char yes) {  //30
		  System.out.println("the character "+yes);
	  }
	  //boolean
	  static void status(boolean status) { //31
		  System.out.println("entered status:"+status);
	  }
	  static void showResult (boolean result) {  //32
		  System.out.println("entered result:"+result);
	  }
	  static void checkPayment(boolean payment) {  //33
		  System.out.println("the payment is"+payment);
	  }
	  static void checkVoting(boolean vote) {  //34
		  System.out.println("the voting is"+vote);
	  }
	  static void checkAvailability(boolean check) {  //35
		  System.out.println("the checkAvailability"+check);
	  }
	  static void aadhar(long aadhar) {  //36
		  System.out.println("the aadhar number is"+aadhar);
	  }
	  static void mobile(long mobile) {   //37
		  System.out.println("the number is"+mobile);
	  }
	  static void longnum(long number) {   //38
		  System.out.println("the number is"+number);
	  }
	  static void pan(long pan) {   //39
		  System.out.println("the pan number is"+pan);
	  }
	  static void random(long num) {   //40
		  System.out.println("the pan number is"+num);
	  }
	  
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started");
		System.out.println("enter percentage");
		double percentage=sc.nextDouble();
		System.out.println("enter cgpa");
		double cgpa=sc.nextDouble();
		System.out.println("enter height");
		double height=sc.nextDouble();
		System.out.println("enter weight");
		double weight=sc.nextDouble();
		System.out.println("enter the grade");
		char grade=sc.next().charAt(0);
		 System.out.println(" enter the character");
		 char chara=sc.next().charAt(0);
		 System.out.println(" enter the symbol");
		 char symbol=sc.next().charAt(0);
		 System.out.println("enter the vowel");
		 char vow=sc.next().charAt(0);
		 System.out.println(" enter ascii related character");
		 char asci=sc.next().charAt(0);
		 System.out.println("the character for yes method");
		char yes=sc.next().charAt(0);
		System.out.println("enter status:");
		boolean status=sc.nextBoolean();
		System.out.println("enter the result");
		boolean result=sc.nextBoolean();
		System.out.println("enter the payment");
		boolean payment=sc.nextBoolean();
		System.out.println("check the voting");
		boolean vote=sc.nextBoolean();
		System.out.println("checking the check  status ");
		boolean check=sc.nextBoolean();
		System.out.println("enter the aadhar number");
		long aadhar=sc.nextLong();
		System.out.println("enter the mobile number");
		long mobile=sc.nextLong();
		System.out.println("enter the long number");
		long num=sc.nextLong();
		System.out.println("enter the pan number");
		long pan=sc.nextLong();
		System.out.println("enter the random long number");
		long rnum=sc.nextLong();
		
		
		percentage(percentage);
		displayCgpa(cgpa);
		 height(height);
		 displayWeight(weight);
		 displayGrade(grade);
		 displayCharacter( chara);
		  printSymbol(symbol);
		ascii(asci);
		showVowel(vow);
		yes(yes);
		status(status);
		showResult(result);
		checkPayment(payment);
		checkVoting(vote);
		checkAvailability(check);
		aadhar(aadhar);
		mobile(mobile);
		longnum(num);
		pan(pan);
		random(rnum);
		
		sc.close();
		
	}
	
}