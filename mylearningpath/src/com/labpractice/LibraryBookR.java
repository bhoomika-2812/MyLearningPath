package com.labpractice;

public class LibraryBookR {
	
	int bookId;
	String bookName;
	String authorName;
	int totalCopies;
	int availableCopies;
	static String libraryName;
	static String librarianName;
	
	void displayBookDetails(int i,String b,String a) {
		System.out.println("Book Id:"+i);
		System.out.println("Book Name:"+b);
		System.out.println("Author Name:"+a);
		System.out.println("Total Copies : " + totalCopies);
		System.out.println("Available Copies : " + availableCopies);
	}
	
	void issuedBooks(int issuedcopies) {
		availableCopies = availableCopies - issuedcopies;
	}
	
	void displayLibraryDetails() {
		System.out.println("Library Name : " +libraryName);
		System.out.println("Librarian Name : " +librarianName);
	}
	
	void changeLibrarian(String name) {
		librarianName=name;
	}

	public static void main(String[] args) {
		
		libraryName="Read Well";
		librarianName="Bhoomi";
		
		LibraryBookR l1 = new LibraryBookR();
		l1.totalCopies=8;
		l1.availableCopies = l1.totalCopies;
		System.out.println("Book 1 Details..");
		l1.issuedBooks(3);
		l1.displayBookDetails(1, "Python 3 ", "gudio" );
		
		LibraryBookR l2 = new LibraryBookR();
		l2.totalCopies=10;
		l2.availableCopies = l2.totalCopies;
		System.out.println("Book 2 Details..");
		l2.issuedBooks(4);
		l2.displayBookDetails(2, "Python 4 ", "gudio" );
		
		System.out.println("Library Details..");
		l1.displayLibraryDetails();
		System.out.println("Updated Librarian Name..");
		l1.changeLibrarian("Asmithaa");
		l1.displayLibraryDetails();
	}

}
