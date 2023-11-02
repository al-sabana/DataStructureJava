package array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Str1EqualsStr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dca";
		String s1 = "cba";

		char[] arr = s.toCharArray();
		char[] arr1 = s1.toCharArray();
	
		PriorityQueue<Character> pq = new PriorityQueue<>();
		for(char i : arr) {
			pq.add(i);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=pq.poll();
		
			
		}
		
		Arrays.sort(arr1);
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr1[i]) {
				result = true;

			}
		}
		if (result) {
			System.out.println(" not equal");
		} else {
			System.out.println(" equal");
		}

	}

}
