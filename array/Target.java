package array;

public class Target {

	public static void target(int[] arr, int t) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == t) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 7, 11, 13 };
		int t = 9;
		target(arr, t);

	}

}
