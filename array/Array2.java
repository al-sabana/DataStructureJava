package array;

public class Array2 {
	public class MatrixRotation {

		public static void main(String[] args) {
			int[][] matrix = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

			int rows = matrix.length;
			int col = matrix[0].length;

			int[][] transpose = new int[col][rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					transpose[j][i] = matrix[i][j];
				}
			}

			int[][] flip = new int[col][rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					flip[j][i] = transpose[col - 1 - j][i];
				}
			}

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(flip[i][j] + " ");
				}
				System.out.println();
			}
		}

	}
}
