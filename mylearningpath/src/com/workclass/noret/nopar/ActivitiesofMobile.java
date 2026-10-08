package com.workclass.noret.nopar;

public class ActivitiesofMobile {
	
	void switchOnMob() {
		System.out.println("I switch on my mobile");
		switchOffMob();
	}
	public void switchOffMob() {
		System.out.println("I switch off my mobile");
		makeCall();
	}
	void makeCall() {
		System.out.println("I make a Call");
		recCall();
	}
	public void recCall() {
		System.out.println("I receive a call");
		sendMessage();
	}
	void sendMessage() {
		System.out.println("I send a message");
		ActivitiesofMobile.recMessage();
	}
	static void recMessage() {
		System.out.println("I received a message");
		openCamera();
	}
	public static void openCamera() {
		System.out.println("I open the camera");
		ActivitiesofMobile.takePic();
	}
	static void takePic() {
		System.out.println("I take a pic");
		playMusic();
	}
	public static void playMusic() {
		System.out.println("I play Music on my mobile");
		chargeMob();
	}
	static void chargeMob() {
		System.out.println("I charge my mobile phone");
	}

	public static void main(String[] args) {
		ActivitiesofMobile a = new ActivitiesofMobile();
		a.switchOnMob();

	}

}
