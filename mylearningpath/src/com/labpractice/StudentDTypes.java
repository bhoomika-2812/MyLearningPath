package com.labpractice;

public class StudentDTypes {
	
	String studentName;
	int age;
	int admissionYear;
	int rollNumber;
	long mobile;
	double percentage;
	double fees;
	char grade;
	boolean status;
	long lStudentId;
	double feePaid;
	
	void displayStudentDetails(String n,int a,int y,long m,double p,double f,char g,boolean s,
			long l, double fp) {
		System.out.println("Name : " + n);
		System.out.println("Age : " + a);
		System.out.println("Year : " + y);
		System.out.println("Mobile : " + m);
		System.out.println("Percentage : " + p);
		System.out.println("Total fees : " + f);
		System.out.println("Grade : " + g);
		System.out.println("Status P/F : " + s);
		System.out.println("Large Student Id : " + l);
		System.out.println("Fee Paid : " + fp);

	}

	public static void main(String[] args) {
		
		System.out.println("Student 1 Details");
		StudentDTypes d1 = new StudentDTypes();
		d1.displayStudentDetails("Bhoomika", 21, 2026, 7013080175l, 99.99, 65000, 'O', true, 54657687878l, 25000);
		
		System.out.println("Student 2 Details");
		StudentDTypes d2 = new StudentDTypes();
		d2.displayStudentDetails("Asmii", 22, 2025, 6667637828l, 95.99, 55000, 'O', true, 98983477333l, 55000);

	}

}

/*public class StudentDTypes {

	public static void main(String[] args) {

		String studentName = "Bhoomi";
		int age = 22;
		int admissionYear = 2022;
		int rollNumber = 101;
		long mobileNumber = 9876543210L;
		double attendancePercentage = 87.5;
		double totalFees = 75000.50;
		char grade = 'A';
		boolean passFailStatus = true;
		long largeStudentId = 9876543210123L;
		double feePaid = 60000.50;

		System.out.println("Student Name : " + studentName);
		System.out.println("Age : " + age);
		System.out.println("Admission Year : " + admissionYear);
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Attendance Percentage : " + attendancePercentage);
		System.out.println("Total Fees : " + totalFees);
		System.out.println("Grade : " + grade);
		System.out.println("Pass/Fail Status : " + passFailStatus);
		System.out.println("Large Student ID : " + largeStudentId);
		System.out.println("Fee Paid : " + feePaid);
	}
}*/
