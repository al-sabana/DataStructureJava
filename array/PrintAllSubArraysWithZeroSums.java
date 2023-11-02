package array;

public class PrintAllSubArraysWithZeroSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, -9, -1, 10, 5, 7};
		boolean foundSubarray = false;

		for (int i = 0; i < arr.length; i++) {

		    for (int j = i; j < arr.length; j++) {
		        int sum = 0;
		        for (int k = i; k <= j; k++) {
		            sum += arr[k];
		        }

		        if (sum == 0) {
		            for (int k = i; k <= j; k++) {
		                System.out.print(arr[k] + " ");
		            }
		            System.out.println("");
		            foundSubarray = true;
		        }
		    }
		}

		if (!foundSubarray) {
		    System.out.println("No subarrays with a sum of zero found.");
		}


	}

}
