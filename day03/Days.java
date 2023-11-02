
package day03;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		int num = scan. nextInt();
		
		switch (num) {
		case 1 :case 3:case 5: case 7 : case 9 :case 11 : System.out.println("31 days");break;
		case 2 : System.out.println("28 days");
		case 4: case 6: case 8: case 10:case 12: System.out.println("30 days");break;
		
		default :System.out.println("invalid"); 
			
		 
		}
		
		
		
  
	}

}
