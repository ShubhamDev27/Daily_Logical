package GFG_Level_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Find_Duplicate_num_with_freq_in_Array {
	
	public static void main(String[] args) {
		 int arr[] = {2, 15, 15, 18, 4, 21, 11, 21, 4, 9};

			Map<Integer,Integer> freq = new HashMap<>();
			for(int num : arr) 
			{
				freq.put(num,freq.getOrDefault(num,0)+1);
			}
			
			for(int num:freq.keySet()) 
			{
				int count = freq.get(num);
				if(count>1) 
				{
					System.out.println(num+" ="+count);
				}
			}
			//System.out.println(freq);
	}
}
