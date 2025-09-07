package Level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int currSum = 0;
		int arr[] = {10, 2, -2, -20, 10};
		int target = -10;
		
		for(int i=0;i<arr.length;i++) 
		{
			currSum+=arr[i];
			
			if(currSum==target) 
			{
				System.out.println("sub array found from index 0 to "+i);
			}
			if(map.containsKey(currSum-target)) 
			{
				System.out.println("sub array found from index "+map.get(currSum-target)+1+" to "+i);
			}
			map.put(currSum, i);
		}
		System.out.println("no sub array found at  index");
	}
	
	
}

