package com.arrays;


public class StudentResults {

	public static void main(String[] args) {
		int marks[] = {98,95,93,99,97};
		int sum=0;
		int avg=0;
		for(int i=0;i<marks.length;i++) {
			sum += marks[i];
		}
		avg = sum/marks.length;
		
		System.out.println("Total Marks : " + sum);
		System.out.println("Average Marks : " + avg);
	}

}
