package array;

public class MissingNumber {

	  public int missingNumber(int[] nums) {
	        int missing = nums.length;
	        for (int i = 0; i < nums.length; i++) {
	            missing ^= i ^ nums[i];
	        }
	        return missing;
	    }

	    public static void main(String[] args) {
	        MissingNumber solution = new MissingNumber();
	        int[] nums1 = {3, 0, 1};
	        int[] nums2 = {0, 1};
	        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

	        System.out.println(solution.missingNumber(nums1)); // Output: 2
	        System.out.println(solution.missingNumber(nums2)); // Output: 2
	        System.out.println(solution.missingNumber(nums3)); // Output: 8
	    }

}
