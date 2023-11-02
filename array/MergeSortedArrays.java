package array;

import java.util.Arrays;

public class MergeSortedArrays {
	 public static int[] mergeArrays(int[] arr1, int[] arr2) {
	        int m = arr1.length;
	        int n = arr2.length;
	        int[] merged = new int[m + n];
	        int i = 0, j = 0, k = 0;

	        // Merge both arrays while maintaining sorted order
	        while (i < m && j < n) {
	            if (arr1[i] <= arr2[j]) {
	                merged[k] = arr1[i];
	                i++;
	            } else {
	                merged[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy any remaining elements from arr1
	        while (i < m) {
	            merged[k] = arr1[i];
	            i++;
	            k++;
	        }

	        // Copy any remaining elements from arr2
	        while (j < n) {
	            merged[k] = arr2[j];
	            j++;
	            k++;
	        }

	        return merged;
	    }

    public static void main(String[] args) {
        int[] X = { 2,  3,  5, 6,};
        int[] Y = {1, 8, 9,10, 15};

        int[] mergedArray = mergeArrays(X, Y);

        // Print the merged and sorted array
        System.out.println(Arrays.toString(mergedArray));
    }
}
