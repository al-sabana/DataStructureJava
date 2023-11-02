package String;

public class BackSpaceStringCompare {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ab c";
		String str1="ah c";
		int index=0;
		int letterIndex=0;
		StringBuilder s = new StringBuilder();
		StringBuilder t = new StringBuilder();
		char[]arr = str.toCharArray();
		char[]arr1 = str1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isWhitespace(arr[i])) {
				index=i;
			}
			letterIndex=index-1;
			if(i == index || i ==letterIndex) {
				
				t.append(arr[i]);
			}else {
				s.append(arr[i]);
			}
			
		}
		System.out.println(index);
		System.out.println(letterIndex);
		System.out.println(s);
		System.out.println(t);
		

	}

}
