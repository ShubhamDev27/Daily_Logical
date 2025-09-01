package GFG_Level_3;

public class Max_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int curSum =nums[0];
        int maxSum = nums[0];
        
        for(int num:nums) 
        {
        	curSum = Math.max(num,curSum+num);
        	maxSum = Math.max(maxSum,curSum);
        }
        System.out.println("Maximum subarray sum = " + maxSum);

	}
}
