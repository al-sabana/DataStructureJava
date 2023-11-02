package day01;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "";
		for (int i = 5; i >= 1; i--) {
			num += i;
			System.out.println(num);
		}

		for (int j = 0; j < 5; j++) {
			String num2 = "";
			for (int i = j - 1; i <= 5; i++) {
				num2 += j;
				System.out.println(num2);
			}
			
		}
		

	}

}
