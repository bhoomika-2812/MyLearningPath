package com.workclass.noret.nopar;

public class Employee {
	
	static void disEmpId() {
		System.out.println("EMp Id: " +101);
	}
	static void disEmpName() {
		System.out.println("EMp NAme: " +"BHoomika");
	}
	static void disEmpSal() {
		System.out.println("Emp Sal : " +75000);
	}
	static void disEmpComp() {
		System.out.println("Emp Comapany : " +"Accenture");
	}
	static void disEmpEMail() {
		System.out.println("Emp Mail : " +"bhoomishetty6@gmail.com");
	}
	void disEmpPhn() {
		System.out.println("Emp Phone : " +"7013080175");
	}
	void disEmpLoc() {
		System.out.println("Emp Location : " +"HYD");
	}
	void disEmpHobbie() {
		System.out.println("Emp Hobbie : " +"Reading Books");
	}
	void disEmpExp() {
		System.out.println("Emp Experience : " +2);
	}
	void disEmpDept() {
		System.out.println("Emp Department : " + "Developing");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		/*-----------Static Method calling ways------------*/
		//  we can call static method directly
		disEmpId();
		// by using class name we can call static method
		Employee.disEmpName();
		// by using obj ref variables we can call static method
		//The static method disEmpSal() from the type Employee should be accessed in a static way
		e.disEmpSal();
		disEmpComp();
		Employee.disEmpEMail();
		
		/*------------Instance Method Calling ways----------*/
		//we can call instance method by using obj ref variable
		e.disEmpPhn();
		e.disEmpLoc();
		e.disEmpHobbie();
		e.disEmpExp();
		e.disEmpDept();		
	}
}
