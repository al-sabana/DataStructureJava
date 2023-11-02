package interviewpractice;

public class TopStudentsEachRow {

	public static void main(String[] args) {

		int[][] arr = { { 3, 0, 0 }, { 1, 2, 5 }, { 6, 19, 12 }, { 10, 20, 33 } };

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 1; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println(max);
		}

	}

}
