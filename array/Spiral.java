package array;

public class Spiral {

	public static void spiral(int[][] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		int top = 0, bottom = arr.length - 1;
		int left = 0, right = arr[0].length - 1;
		while (true) {
			if (left > right) {
				break;
			}
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;
			if (top > bottom) {
				break;
			}
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;
			if (left > right) {
				break;
			}
			  // print bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
 
            if (top > bottom) {
                break;
            }
 
            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[][]arr = { {1,2,3,4},{4,5,6,4},{7,8,9,0}};
		spiral(arr);
	}

}
