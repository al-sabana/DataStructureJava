package interviewpractice;

public class Palindrome {

	public static boolean isPalindrome(String s) {

		s = s.replaceAll(" ", "").toLowerCase();

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A man a plan a canal Panama";
		boolean res = isPalindrome(s);
		if(res) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not palindrome");
		}

	}

}
