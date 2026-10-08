package com.workclass.noret.nopar;

public class LapActivities {
	
	static void openLap() {
		System.out.println("Please open the lap");
		LapActivities.connWifi();
	}
	public static void connWifi() {
		System.out.println("Connect the lap to wifi");
		searchInternet();
	}
	static void searchInternet() {
		System.out.println("Search for info online");
		LapActivities.watchVideo();
	}
	public static void watchVideo() {
		System.out.println("Watch a Java Tutorial Videos");
		lisMusic();
	}
	static void lisMusic() {
		System.out.println("Melodyy Music Play");
		LapActivities m = new LapActivities();
		m.sendEmail();
	}
	void sendEmail() {
		System.out.println("Haii I sent an Email");
		dowFile();
	}
	public void dowFile() {
		System.out.println("File Downloading...");
		uploadFile();
	}
	void uploadFile() {
		System.out.println("Please Upload a file");
		takeScshot();
	}
	public void takeScshot() {
		System.out.println("Done Screenshot");
		closeLap();
	}
	void closeLap() {
		System.out.println("Close the Laptp");
	}

	public static void main(String[] args) {
		openLap();
	}

}
