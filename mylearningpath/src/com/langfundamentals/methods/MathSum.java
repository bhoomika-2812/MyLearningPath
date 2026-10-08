package com.langfundamentals.methods;

import java.util.Scanner;

public class MathSum {
	double areaOfTri(double b, double h) {
		return 0.5 * b * h;
	}

	double areaOfSquare(double s) {
		return s * s;
	}

	double areaOfRec(double l, double b) {
		double rec = l * b;
		return rec;
	}

	double areaOfCircle(double r) {
		double circle = Math.PI * r * r;
		return circle;
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Breadth : ");
		double breadth = sc.nextDouble();
		System.out.println("Enter height : ");
		double height = sc.nextDouble();
		double triangle = areaOfTri(breadth, height);
		System.out.println("Area Of Triangle : " + triangle);

		System.out.println("Enter Side : ");
		double side = sc.nextDouble();
		double square = areaOfSquare(side);
		System.out.println("Area Of Square : " + square);

		System.out.println("Enter Radius : ");
		double rad = sc.nextDouble();
		double circle = areaOfCircle(rad);
		System.out.println("Area Of Circle : " + circle);

		System.out.println("Enter length : ");
		double len = sc.nextDouble();
		System.out.println("Enter Breadth : ");
		double b = sc.nextDouble();
		double rectangle = areaOfRec(len, b);
		System.out.println("Area Of Rectangle : " + rectangle);

	}

}
