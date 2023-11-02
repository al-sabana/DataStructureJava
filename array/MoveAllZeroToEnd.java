package array;

public class MoveAllZeroToEnd {
    public static int[] moveZeros(int[] arr) {
    	int n = arr.length;
    	int nonZero =0;
    	for(int i=0;i<n;i++) {
    		if(arr[i] != 0) {
    			arr[nonZero]=arr[i];
    			nonZero++;
    		}
    	}
    	for(int i=nonZero;i<n;i++) {
    		arr[i]=0;
    	}
    	
    	return arr;
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,3,4,0,1};
		int[] result = moveZeros(arr);
		for(int i:result) {
			System.out.print(i +" ");
		}

	}

}
