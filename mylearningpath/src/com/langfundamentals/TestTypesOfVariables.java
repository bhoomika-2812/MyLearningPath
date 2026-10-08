package com.langfundamentals;

public class TestTypesOfVariables {

	// Primitive + static
	static int collegeId = 111;
	// Object + static
	static String collegeName = "VCube";

	// Primitive + instance
	int rollNo = 0;
	// Object + instance
	String name = "Unknown";

	public static void main(String[] args) {

		// Re - declaring
		// Primitive + Local
		int collegeId = 222;
		// Object + Local
		String collegeName = "Pace";

		// The local variable a may not have been initialized
		// JVM will not provide default values for Local Variables.
		// Local variables can be declared but without initialization we can't access
		int a;
		// Illegal modifier for parameter a; only final is permitted
		// static int a;
//		System.out.println(a); 

//		1st way : Static data we can access directly..	
		System.out.println(collegeId);
		System.out.println(collegeName);

//		2nd way : Static data we can access using Class name..
		System.out.println(TestTypesOfVariables.collegeId);
		System.out.println(TestTypesOfVariables.collegeName);

		TestTypesOfVariables t = new TestTypesOfVariables();

//		3rd way : Static data we can access using Object Reference Variable..
//		The static field TestTypesOfVariables.collegeId should be accessed in a static way
		
		System.out.println(t.collegeId);
		System.out.println(t.collegeName);

//		But Instance Data we can access only Object Reference Variable..
		System.out.println(t.rollNo);
		System.out.println(t.name);
	}

}
