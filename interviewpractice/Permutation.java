package interviewpractice;

public class Permutation {
	
	public static boolean permutation(String str1 , String str2) {
		
		if(str1.length()!= str2.length()) {
			System.out.println("Not a permutation");
		}
		int count=0;
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if(count == str1.length() && count == str2.length()) {
			System.out.println("Permutation");
			return true;
		}else {
			System.out.println("Not a Permutation");
			return false;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		permutation("llo","ollj");

	}

}
