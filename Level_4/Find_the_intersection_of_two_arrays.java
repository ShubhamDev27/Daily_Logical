package Level_4;

import java.util.*;

public class Find_the_intersection_of_two_arrays {

	public static void main(String[] args) {
		int[] A = {1, 2, 2, 1};
        int[] B = {2, 2};
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for(int num: A) 
        {
        	map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num:B) 
        {
        	if(map.containsKey(num) && map.get(num)>0) 
        	{
        		result.add(num);
        		map.remove(num,map.get(num)-1);
        	}
        }
        
        System.out.println(result);
	}
}

//                        🔎 Step-by-step:
//
//              First element num = 2 (from nums2):
//
//              Check map.containsKey(2) → ✅ true (map has key 2).
//
//              Check map.get(2) > 0 → value = 2 → ✅ true.
//
//              Add 2 to result.
//               → result = [2]

//              Decrease frequency of 2 in map: map.put(2, 1)
//              → HashMap becomes {1=2, 2=1}