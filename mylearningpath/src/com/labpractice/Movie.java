package com.labpractice;

public class Movie {
	
	String movieName;
	String releasedYear;
	int ticketPrice;
	
	void displayMovieDetails(String n, String y, int p) {
		System.out.println("Movie Name : " + n);
		System.out.println("Released Year : " + y);
		System.out.println("Ticket Price : " + p);
	}

	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		System.out.println("Movie 1 Details..");
		m1.displayMovieDetails("Orange","2008",150);
		System.out.println("Movie 2 Details..");
		m2.displayMovieDetails("Bharat ane nenu", "2013",130);
		System.out.println("Movie 3 Details..");
		m3.displayMovieDetails("Sarainodu","2014",120);
	}
}
