package com.oops;

public class TestStudent {

	public static void main(String[] args) {
		
		//we can create a object for our model in this class..
		Student s = new Student();
		
		//modify the data
		s.setSid(10);
		s.setSname("Bhoomiii");
		s.setMobNo(7013080175l);
		s.setAddress("Hyderabad");
		
		//read the data
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getMobNo());
		System.out.println(s.getAddress());
		System.out.println(s);
		
		System.out.println("------------------------------");
		System.out.println("Next Student Details..");
		System.out.println("------------------------------");
		
		Student s1 = new Student(11,"Chanduu..",8457877487l,"Bangalore");
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getMobNo());
		System.out.println(s1.getAddress());
		System.out.println(s1); // without toString() it shows address of an object.
	}

}
