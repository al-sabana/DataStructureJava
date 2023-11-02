
package array;

import java.util.Scanner;

public class TransposeMatrix {

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

		int[][] arr1 = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[j][i] = arr[i][j];
			}

		}
		System.out.println("Transpose array :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
