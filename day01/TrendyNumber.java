package day01;

import java.util.Scanner;

public class TrendyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your number 3 digit number");

		int num = scan.nextInt();

		String var = Integer.toString(num);

		int num1 = Character.getNumericValue(var.charAt(1));

		if (num1 % 3 == 0) {
			System.out.println("trendy");
		} else {
			System.out.println("not trendy");
		}

	}

}
