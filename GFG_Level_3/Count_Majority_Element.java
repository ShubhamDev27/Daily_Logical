package GFG_Level_3;

import java.util.HashMap;
import java.util.Map;

public class Count_Majority_Element {

	public static void main(String[] args) {
        Map<Integer, Integer> counts = new HashMap<>();

        int arr[] = {1,2,2,2,1,1,1,1};
        int n = arr.length;
        for(int num:arr) 
        {
            counts.put(num,counts.getOrDefault(num, 0) + 1);
            if(counts.get(num)>n/2)
            {
            	System.out.println("majority element "+num);
            }
            
        {
        	
        	
        	
        		
        	}
        }
	}
}
