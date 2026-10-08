package com.workclass.noret.nopar;

public class SimpleActions {
	
	void sitDown() {
		System.out.println("Please Sit Down");
	}
	void standUp() {
		System.out.println("Please Stand Up");
	}
	void walkAround() {
		System.out.println("Goo and Walk");
	}
	void runFast() {
		System.out.println("Please Run Fast");
	}
	void jumpHigh() {
		System.out.println("Jump High");
	}
	void clapHands() {
		System.out.println("Clap your Hands");
	}
	void raiseHand() {
		System.out.println("Raise Your Hand");
	}
	void shakeHands() {
		System.out.println("Shake your Hands");
	}
	void closeEyes() {
		System.out.println("Close your Eyes");
	}
	void takeRest() {
		System.out.println("Take Rest");
	}
	
	public static void main(String[] args) {
		
		SimpleActions s = new SimpleActions();
		
		s.sitDown();
		s.standUp();
		s.walkAround();
		s.runFast();
		s.jumpHigh();
		s.clapHands();
		s.raiseHand();
		s.shakeHands();
		s.closeEyes();
		s.takeRest();

	}

}
