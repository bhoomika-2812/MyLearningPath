package com.labpractice;

public class EmployeeDetails {
	
	int empId;
	String name;
	String mobile;
	String email;
	
	static String deptName;
	static String location;

	public static void main(String[] args) {
		
		deptName="HR";
		location="Hyd";
		
		EmployeeDetails e1 = new EmployeeDetails();
		EmployeeDetails e2 = new EmployeeDetails();
		EmployeeDetails e3 = new EmployeeDetails();
		EmployeeDetails e4 = new EmployeeDetails();
		EmployeeDetails e5 = new EmployeeDetails();
		
		e1.empId=101;
		e1.name="Bhoomika";
		e1.mobile="79870329493";
		e1.email="bhoomishetty12@gmail.com";
		
		System.out.println("Employee 1 Details..");
		System.out.println("Id : " + e1.empId + " " + "EMp name : " + e1.name + " " + "Mobile:"+e1.mobile+" " +
		"Email: " + e1.email + " " + "DEpt : " + " " + deptName + " " + "location : " +location);
		
		e2.empId=102;
		e2.name="Asmitha";
		e2.mobile="7374837477";
		e2.email="asmithaa3@gmail.com";
		
		System.out.println("Employee 2 Details..");
		System.out.println("Id : " + e2.empId + " " + "EMp name : " + e2.name + " " + "Mobile:"+e2.mobile+" " +
		"Email: " + e2.email + " " + "DEpt : " + " " + deptName + " " + "location : " +location);
		
		e3.empId=103;
		e3.name="Sowjii";
		e3.mobile="8983782778";
		e3.email="sowjii75@gmail.com";
		
		System.out.println("Employee 3 Details..");
		System.out.println("Id : " + e3.empId + " " + "EMp name : " + e3.name + " " + "Mobile:"+e3.mobile+" " +
		"Email: " + e3.email + " " + "DEpt : " + " " + deptName + " " + "location : " +location);
		
		deptName="Testing";
		e4.empId=104;
		e4.name="kajol";
		e4.mobile="7332415425";
		e4.email="kajuu@gmail.com";
		
		System.out.println("Employee 4 Details..");
		System.out.println("Id : " + e4.empId + " " + "EMp name : " + e4.name + " " + "Mobile:"+e4.mobile+" " +
		"Email: " + e4.email + " " + "DEpt : "  + deptName + " " + "location : " +location);
		
		e5.empId=105;
		e5.name="keerthana";
		e5.mobile="8728727999";
		e5.email="keeru@gmail.com";
		
		System.out.println("Employee 5 Details..");
		System.out.println("Id : " + e5.empId + " " + "EMp name : " + e5.name + " " + "Mobile:"+e5.mobile+" " +
		"Email: " + e5.email + " " + "DEpt : " + " " + deptName + " " + "location : " +location);

	}

}
