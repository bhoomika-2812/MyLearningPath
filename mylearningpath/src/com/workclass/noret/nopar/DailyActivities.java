package com.workclass.noret.nopar;

public class DailyActivities {
	static void wakeUp() {
		System.out.println("I wake up early in the morning.");
	}
	static void brushTeeth() {
		System.out.println("I Brush my Teeth");
	}
	static void takeBath() {
		System.out.println("I take a bath");
	}
	public static void haveBreakfast() {
		System.out.println("I have my BreakFast");
	}
	public void goToCollege() {
		System.out.println("I go to College");
	}
	void attendClass() {
		System.out.println("I attend My Class");
	}
	void haveLunch() {
		System.out.println("I have my Lunch");
	}
	void study() {
		System.out.println("I Study My Subjects");
	}
	void playGames() {
		System.out.println("I play Games in the Evening");
	}
	void goToSleep() {
		System.out.println("I go to sleep at night");
	}

	public static void main(String[] args) {
		DailyActivities d = new DailyActivities();
		wakeUp();
		DailyActivities.brushTeeth();
		d.takeBath();
		haveBreakfast();
		d.goToCollege();
		d.attendClass();
		d.haveLunch();
		d.study();
		d.playGames();
		d.goToSleep();

	}

}
