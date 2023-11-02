package array;

public class FlippingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
		   int n = arr.length;
	            for(int j=0;j<n;j++){
	            	int start=0;
	            	int end=n-1;
	            	while(start<end) {
	            		int temp= arr[j][start];
	            		arr[j][start]=arr[j][end];
	            		arr[j][end]=temp;
	            		start++;
	            		end--;
	            		
	            	}
	                 
	            }
	        
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<n;j++) {
			  if(arr[i][j]==0) {
				  arr[i][j]=1;
			  }else {
				  arr[i][j]=0;
			  }
			  System.out.println(arr[i][j]+" ");
		  }
		 System.out.println("");
	  }
	        

	}

}
