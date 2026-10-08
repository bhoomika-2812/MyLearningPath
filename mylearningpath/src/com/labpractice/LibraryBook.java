package com.labpractice;

public class LibraryBook {
	
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	static String libraryName;
	static String librarianName;
	
	void displayBookDetails(int i,String b,String n,int a){
		System.out.println("Book Id : " + i + " , " + "Book Name : " + b + " , " + "Author Name : " + n + " , " +
	                     "Available Copies : " + a);
		//System.out.println("Library name : " +libraryName);
	}
	
	void displayLibraryDetails() {
		
		System.out.println("Library Name : " + libraryName);
		System.out.println("Librarian Name : " + librarianName);
	}
	
	void changeLibrarian(String n){
		librarianName=n;
	}

	public static void main(String[] args) {
		
		libraryName="Read well";
		librarianName="Bhoomika";
		LibraryBook l1 = new LibraryBook();
		LibraryBook l2 = new LibraryBook();
		
		System.out.println("Book 1 Details...");
		l1.displayBookDetails(1,"Python - 3","Gudio Van Rossum",6);
		
		System.out.println("Book 2 Details...");
		l2.displayBookDetails(2,"Python - 4","Gudio Van Rossum",8);
		
		System.out.println("Library Details Book 1....");
		l1.displayLibraryDetails();
		
		System.out.println("Library Details Book 2....");
		l2.displayLibraryDetails();
		
		System.out.println("Updated Librarian...");
		l1.changeLibrarian("Asmii");
		l1.displayLibraryDetails();

	}

}
