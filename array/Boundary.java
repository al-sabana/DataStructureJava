package array;

import java.util.Scanner;

public class Boundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int sum =0;
		for(int k=0;k<row;k++) {
			for(int m=0;m<column;m++) {
				
				if(k==0|| m==0 || k==row-1 || m==column-1) {
					sum+=arr1[k][m];
				}
					
					
			}
		}
		System.out.println(sum);
		
	}

}
