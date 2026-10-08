package com.labpractice;

public class MovieR {
	
	int movieId;
	String movieName;
	String heroName;
	int totalSeats;
	int availableSeats;
	
	static String theaterName;
	static String managerName;
	
	/*void bookSeat(int booked) {
		availableSeats = availableSeats - booked;
	}*/
	
	void bookSeat() {
		availableSeats = availableSeats - 1;
	}
	
	void diplayMovieDetails(int i,String n,String h) {
		System.out.println("Movie ID : " + i);
		System.out.println("Movie Name : " + n);
		System.out.println("Hero Name : " + h);
		System.out.println("Total Seats : " + totalSeats);
		System.out.println("Available Seats : " + availableSeats);
	}
	
	void displayTheatreDetails() {
		System.out.println("Theatre Name : " + theaterName);
		System.out.println("Manager Name : " + managerName);
	}
	
	void changeManager(String name) {
		managerName = name;
	}

	public static void main(String[] args) {
		
		theaterName="Arjun Theatre";
		managerName="Bhoomika";
		
		
		MovieR m1 = new MovieR();
		m1.totalSeats=10;
		m1.availableSeats=m1.totalSeats;
		System.out.println("Movie 1 Details..");
		//m1.bookSeat(4);
		m1.bookSeat();
		m1.diplayMovieDetails(101,"Irumudi","Raviteja");
		
		MovieR m2 = new MovieR();
		m2.totalSeats=15;
		m2.availableSeats=m2.totalSeats;
		System.out.println("Movie 2 Details..");
		//m2.bookSeat(10);
		m2.bookSeat();
		m2.diplayMovieDetails(102,"Toxic","Yash");
		
		System.out.println("Theatre Details..");
		m1.displayTheatreDetails();
		
		System.out.println("Updated Manager..");
		m1.changeManager("Asmii");
		m1.displayTheatreDetails();

	}

}
