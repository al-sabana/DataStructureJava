package corePractice.ArrayList;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();// we didn't know the array size we can use arrayList for
															// flexibility.

		for (int i = 0; i < 20; i++) {
			list.add(i);

		}
		System.out.println(list);

		// we can use string arrayList also
		ArrayList<String> arr = new ArrayList<String>();// we didn't know the array size we can use arrayList for
														// flexibility.

		arr.add("sabin");

		System.out.println(arr);
	}

}
