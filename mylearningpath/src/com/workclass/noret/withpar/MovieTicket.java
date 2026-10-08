package com.workclass.noret.withpar;

import java.util.Scanner;

public class MovieTicket {
	void setMovieName(String name) {
		System.out.println("Movie Name : " +name);
	}
	void setViewerAge(byte age) {
		System.out.println("Viewer Age : "+age);
	}
	void setReleaseYear(short year) {
		System.out.println("Release Year : "+year);
	}
	void setSeatNo(int sno) {
		System.out.println("Seat Number : "+sno);
	}
	void setBookingId(long bookId) {
		System.out.println("Booking ID : "+bookId);
	}
	void setMovieRating(float rate) {
		System.out.println("Movie Rating : "+rate);
	}
	void setTicketPrice(double price) {
		System.out.println("Ticket Price : "+price);
	}

	public static void main(String[] args) {
		MovieTicket m = new MovieTicket();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie : ");
		String name = sc.nextLine();
		System.out.println("Enter Viewer Age : ");
		byte age = sc.nextByte();
		System.out.println("Enter Release Year : ");
		short year = sc.nextShort();
		System.out.println("Enter Seat Number : ");
		int sno = sc.nextInt();
		System.out.println("Enter Booking ID : ");
		long bookId = sc.nextLong();
		System.out.println("Enter Movie Rating : ");
		float rate = sc.nextFloat();
		System.out.println("Enter Ticket Price : ");
		double price = sc.nextDouble();
		m.setMovieName(name);
		m.setViewerAge(age);
		m.setReleaseYear(year);
		m.setSeatNo(sno);
		m.setBookingId(bookId);
		m.setMovieRating(rate);
		m.setTicketPrice(price);
		sc.close();
	}

}
