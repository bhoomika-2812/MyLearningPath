package com.workclass.noret.nopar;

public class AccountDetails {

	static void openAccount() {
		System.out.println("I open a bank account");
		AccountDetails.depoMoney();
	}

	public static void depoMoney() {
		System.out.println("I deposit money into my account");
		withdrawMoney();
	}

	static void withdrawMoney() {
		System.out.println("I withdraw money from my account");
		checkBalance();
	}

	public static void checkBalance() {
		System.out.println("I check my account number");
		AccountDetails.transferMoney();
	}

	static void transferMoney() {
		System.out.println("I transfer money to another account");
		AccountDetails d = new AccountDetails();
		d.checkAccNo();
	}

	public void checkAccNo() {
		System.out.println("I check my account number");
		disBankName();
	}

	void disBankName() {
		System.out.println("Canara Bank");
		disBranchName();
	}

	public void disBranchName() {
		System.out.println("Hyderabad");
		checkInterest();
	}

	void checkInterest() {
		System.out.println("I check the interest amount");
		disAccDetails();
	}

	void disAccDetails() {
		System.out.println("My Account detailssss");
	}

	public static void main(String[] args) {
		AccountDetails.openAccount();

	}

}
