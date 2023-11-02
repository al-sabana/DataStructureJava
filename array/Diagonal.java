package array;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter row");
		int row = scan.nextInt();
		System.out.println("enter column");
		int column = scan.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("enter value of array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		StringBuilder str = new StringBuilder("");
		StringBuilder str1 = new StringBuilder("");
		for (int i = 0; i < row; i++) {
			
			str.append(arr[i][i]+" ");
			str1.append(arr[i][arr.length-1-i] +" ");
		}
		System.out.println(str);
		System.out.println(str1);

	}

}
