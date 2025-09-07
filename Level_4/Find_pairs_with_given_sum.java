package Level_4;

import java.util.*;

public class Find_pairs_with_given_sum {

	public static void main(String[] args) {
	    int[] arr = {1,2,2,8};
        int sum = 10;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num:arr) 
        {
        	int complement=sum-num;
        	if(map.containsKey(complement)) 
        	{
        		int count = map.get(complement);
        		for(int i=0;i<count;i++) 
        		{
        			System.out.println(complement+" "+num);
        		}
        	}
        	map.put(num,map.getOrDefault(num,0)+1);
        }

	}
}
  

//            arr = [1, 2, 2, 8]
//            target = 10
//            num = 8
//            map = {1=1, 2=2}
//            complement = 2
//            count = 2 → print 2 pairs (2,8), (2,8)