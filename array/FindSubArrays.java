package array;

public class FindSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bubble sort
		int[]arr= {2,4,1,7,8};
		int temp=arr[0];
		boolean isSwapped=false;
		for(int i=0;i<arr.length-1;i++) {
		
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped) {
				break;
			}
		}
		// print subArrays
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					System.out.println("");
				}
			}
		}
		
		
		

	}

}
