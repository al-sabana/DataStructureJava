package array;

public class subarraySumWithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={ 3, 4, 3, 1, 3, 1, -4, -2, -2 };
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum==0) {
			System.out.println("Exist");
			
		}else {
			System.out.println("Not exist");
		}
			
	}

}
