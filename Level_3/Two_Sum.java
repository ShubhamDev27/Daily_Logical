package GFG_Level_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int arr1[]=TwoSum(nums,target);
        
        System.out.println(Arrays.toString(arr1));
	}
	
	public static int[] TwoSum(int nums [] ,int target) 
	{
           Map<Integer,Integer> map =new HashMap<>();
        
        for(int i=0;i<nums.length-1;i++) 
        {
        	int num=target-nums[i];
        	if(map.containsKey(num)) 
        	{
        	  return new int[] {map.get(num),i};
        	}
        	map.put(nums[i], i);
        }
        return new int[] {};
	}
}
