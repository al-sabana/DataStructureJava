
package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("row");
		int row = scan.nextInt();
		System.out.println("column");
		int column = scan.nextInt();
		int[][] arr1 = new int[row][column];
		System.out.println("enter array value");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
				arr1[i][j] = scan.nextInt();
			}
		}
		
		
		System.out.println("row 2nd array");
		int row1 = scan.nextInt();
		System.out.println("column 2nd array");
		int column1 = scan.nextInt();
		int[][] arr2 = new int[row1][column1];
		
		System.out.println("enter array value");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				
				arr2[i][j] = scan.nextInt();
			}
		}
		
		
        for(int k=0;k<row;k++) {
        	int sum = 0;
        	for(int l=0;l<row1;l++) {
        		sum = arr1[k][l] + arr2[k][l];
        		System.out.print(sum+" ");
        	}
        	System.out.println();
        	
        	
        }
        
        
        
	}

}
