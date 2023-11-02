package interviewpractice;

import java.util.Arrays;

public class ArrayPermutation {
	public static void main(String[] args) {
        int[] array = {1, 2, 3};
        generatePermutations(array, 0);
    }

    public static void generatePermutations(int[] array, int index) {
        if (index == array.length - 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = index; i < array.length; i++) {
                // Swap the current element with the element at index
                swap(array, index, i);
                // Recursively generate permutations for the remaining elements
                generatePermutations(array, index + 1);
                // Backtrack by swapping back to the original order
                swap(array, index, i);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
