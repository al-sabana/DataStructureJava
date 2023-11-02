package array;

import java.util.*;

public class OneOddOneEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Please enter array value");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int[] resultArray = new int[n];
		int oddIndex = 0;
		int evenIndex = 1;

		for (int num : arr) {
			if (num % 2 != 0) {
				resultArray[oddIndex] = num;
				oddIndex += 2;
			} else {

				resultArray[evenIndex] = num;
				evenIndex += 2;
			}
			
		}
		System.out.println(Arrays.toString(resultArray));
		
		
		

	}

}
