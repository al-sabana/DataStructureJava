package day03;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("enter row");
		    int rows = scan.nextInt();
		    System.out.println("enter col");
		    int column = scan.nextInt();
		    int[][]array= new int[rows][column];
		    
		    for(int i=0;i < rows;i++){
		    	
		      for(int j=0;j<column;j++){
		    	  System.out.println("enter array value");
		        array[i][j]=scan.nextInt();
		      }
		    }
		    System.out.println("enter index");
		    int index = scan.nextInt();
		    int indexValue=0;
		    
		    int[][]arr = new int[rows-1][column];
		    for(int i=0;i<rows;i++){
		      if(i != index){
		        arr[indexValue++]=array[i];
		      }
		    }
		    for(int i=0;i<arr.length;i++){
		      for(int j=0;j<column;j++){
		        System.out.print(arr[i][j] + " ");
		      }
		      System.out.println();
		    }
		    
		  }


}
