package com.workclass.noret.nopar;

public class Bank {
	
	void openAccount() {
		System.out.println("Account Opened");
	}
	void depositMoney() {
		System.out.println("Money Deposited");
	}
	void withDraw() {
		System.out.println("Money Withdraw");
	}
	void checkBal() {
		System.out.println("Check yor balance");
	}
	void transferMoney() {
		System.out.println("Money transfered succesfully");
	}
	void checkAccNo() {
		System.out.println("Check Account Number");
	}
	void changePin() {
		System.out.println("Pin Changed");
	}
	void checkMiniStmt() {
		System.out.println("Your mini stmt");
	}
	void payBill() {
		System.out.println("Your Payment Bill");
	}
	void closeAcc() {
		System.out.println("Your Account Closed");
	}

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.openAccount();
		b.depositMoney();
		b.withDraw();
		b.checkBal();
		b.transferMoney();
		b.checkAccNo();
		b.changePin();
		b.checkMiniStmt();
		b.payBill();
		b.closeAcc();

	}

}
