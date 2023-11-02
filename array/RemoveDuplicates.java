package array;

public class RemoveDuplicates {
	public static int[] insertElement(int[] originalArray, int element, int position) {
	    int n = originalArray.length;
	    int[] newArray = new int[n + 1];

	    for (int i = 0; i < n + 1; i++) {
	        if (i == position) {
	            newArray[i] = element; // Insert the new element
	        } else if (i < position) {
	            newArray[i] = originalArray[i]; // Copy elements from the original array before the insertion point
	        } else {
	            newArray[i] = originalArray[i - 1]; // Copy elements from the original array after the insertion point
	        }
	    }

	    return newArray;
	}


	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		int insert = 19;
		int position = 0; // Insert at index 2 (0-based)

		int[] newArr = insertElement(arr, insert, position);

		for (int i : newArr) {
		    System.out.print(i + " ");
		}
		
		char character = 'A';    
		int ascii = (int) character;
		System.out.println(ascii);
				

	}

}
