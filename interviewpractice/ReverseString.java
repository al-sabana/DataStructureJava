package interviewpractice;

public class ReverseString {

	public static String reverse(String input) {

	    int length = input.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
	}

	public static void main(String[] args) {
		// Hello, world
		
		String str ="Hello, world";
		String out = reverse(str);
		System.out.println(out);

	}

}
