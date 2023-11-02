package String;

import java.util.*;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String value");
		String str = scan.nextLine();
		System.out.println("Enter Second String value");
		String check = scan.nextLine();
		int length = check.length();
		int count = 0;
		int k = 0;
		for (int i = 0; i < length; i++) {
			for (int j = k; j < str.length(); j++) {
				if (check.charAt(i) == str.charAt(j)) {
					count++;
					k = j + 1;
					break;
				}
			}
		}

//		System.out.println(count);
		if (count == length) {
			System.out.println("The result is 1");
		} else {
			System.out.println("The result is 0");
		}

	}

}
