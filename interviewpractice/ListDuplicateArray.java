package interviewpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListDuplicateArray {

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (set.contains(i)) {
				return true; // Found a duplicate
			}
			set.add(i); // Add the element to the HashSet
		}
		return false; // No duplicates found
	}

	public static void printDuplicateValues(int[] arr) {
		HashSet<Integer> uniqueSet = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (uniqueSet.contains(arr[i])) {
				if (!duplicates.contains(arr[i])) {
					duplicates.add(arr[i]);
				}
			} else {
				uniqueSet.add(arr[i]);
			}
		}

		if (duplicates.isEmpty()) {
			System.out.println("No duplicate values found.");
		} else {
			System.out.println("Duplicate values in the array:");
			for (int duplicate : duplicates) {
				System.out.println(duplicate);
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 2, 4, 1, 5, 6, 1 };

		// Loop through the array
		printDuplicateValues(arr);

	}

}
