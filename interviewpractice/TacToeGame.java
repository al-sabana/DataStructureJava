package interviewpractice;

public class TacToeGame {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5,5, 7, 7 };
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					
					
					System.out.println(arr[i]);
					
				}
			}
		
		}

	}
}
