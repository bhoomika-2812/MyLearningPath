package com.langfundamentals;

class Student {
	int sid;
	String name;
	Address address;
}

class Address {
	String city;
	String state;
	String country;
}

public class TestDataTypesDemoObj3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.sid = 101;
		s.name = "bhoomi";
		s.address = new Address();
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.address);

		s.address.city = "Hyderabad";
		s.address.state = "TG";
		s.address.country = "India";

		System.out.println(s.address.city);
		System.out.println(s.address.state);
		System.out.println(s.address.country);

	}

}
