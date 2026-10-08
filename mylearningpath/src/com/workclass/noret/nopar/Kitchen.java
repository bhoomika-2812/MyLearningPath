package com.workclass.noret.nopar;

public class Kitchen {

	public static void main(String[] args) {
		Kitchen k = new Kitchen();
		k.cutVeg();
	}
	void cutVeg() {
		System.out.println("Cut The Vegetables");
		washDishes();
	}
	void washDishes() {
		System.out.println("Wash the dishes");
		boilWater();
	}
	void boilWater() {
		System.out.println("Boil the Water");
		makeTea();
	}
	void makeTea() {
		System.out.println("Make tea");
		makeJuice();
	}
	void makeJuice() {
		System.out.println("Make Juice");
		serveFood();
	}
	void serveFood() {
		System.out.println("Serve the food");
		openFridge();
	}
	void openFridge() {
		System.out.println("Open the Fridge");
		closeFridge();
	}
	void closeFridge() {
		System.out.println("Close the Fridge");
		washFruit();
	}
	void washFruit() {
		System.out.println("Wash the Fruit");
		setTable();
	}
	void setTable() {
		System.out.println("Set the table");
	}

}
