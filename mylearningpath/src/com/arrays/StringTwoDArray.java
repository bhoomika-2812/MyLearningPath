package com.arrays;

public class StringTwoDArray {

	public static void main(String[] args) {
		
		String [][] names = new String[2][3];
		
		names[0][0] = "bhoomi";
		names[0][1] = "Bhoomi";
		names[0][2] = "Bhooms";
		
		names[1][0] = "koushi";
		names[1][1] = "Koushik";
		names[1][2] = "Koushuluuu";
		
//		for(String [] n : names) { // convert twod[][] into oned[]
//			for(String name : n) { // oned[] to normal
//				System.out.print(name + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.print(names[i][j] + " | ");
			}
			System.out.println();
		}
		
	}

}
