// A jagged array (also called a ragged or irregular array) 
// is an array of arrays where the member inner arrays can have different lengths.
package com.arrays;

public class JaggedArrayEx {

	public static void main(String[] args) {
		int [][] arr = new int[2][]; // only rows 0 and 1
		
		arr[0] = new int[3]; // 0 1 2
		arr[1] = new int[2]; // 0 1
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		
//		for(int []arr1:arr) {
//			for(int a : arr1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
