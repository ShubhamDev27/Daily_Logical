package Level_4;

import java.util.*;

public class find_the_majority_element_or_voting {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,1,1,1,2,2};
		int n=arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:arr) 
        {
        	map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(int key: map.keySet()) 
        {
        	int result=map.get(key);
        	if(result>n/2) 
        	{
        		System.out.println(key+"="+result);
        	}
        }
	} 
	
}
