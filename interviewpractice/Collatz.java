package interviewpractice;

public class Collatz {

	public static void main(String[] args) {

		int n = 20000;

		while (n != 0) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = ((3 * n) + 1);
			}
			if (n <= 1) {
				return;
			}
			System.out.println(n);
		}

	}

}
