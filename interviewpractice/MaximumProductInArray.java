package interviewpractice;

import java.util.Arrays;

public class MaximumProductInArray {

	public static boolean maximumProduct(int[] arr) {

		Arrays.sort(arr);
		int n = arr.length;
		int neg = 0;
		int pos = 0;

		neg = arr[0] * arr[1];
		pos = arr[n - 1] * arr[n - 2];

		if (neg < pos) {
			System.out.println(pos);
			return true;

		} else {
			return false;
		}

	}
	
	public static void main(String[] args) {
		int[] array = {1,3,0,0,11,0};
		maximumProduct(array);
	}

	

}
