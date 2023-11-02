package practices;

public class FindLeader {

	public static void main(String[] args) {
		// O(n*n);

		int[] arr = { 20, 10, 9, 15, 7, 3, 1, 12 };
		for (int i = 0; i < arr.length; i++) {
			boolean check = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					check = false;
					break;
				}
			}
			if (check) {
				System.out.println(arr[i] + " ");
			}

		}

		System.out.println("O(n)");

		int max = arr[arr.length - 1];
		System.out.print(max + " ");
		for (int k = arr.length - 2; k >= 0; k--) {
			if (arr[k] > max) {
				max = arr[k];
				System.out.print(arr[k] + " ");

			}
		}
	}

}
