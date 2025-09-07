package Level_4;

import java.util.*;;

public class Union_Of_Array {

	public static void main(String[] args) {
		 int[] A = {1, 2, 3};
	        int[] B = {2, 3, 4};

	        Set<Integer> union =new LinkedHashSet<>();
	        
	        for(int num:A) 
	        {
	        	union.add(num);
	        }
	        for(int num:B) 
	        {
	        	union.add(num);
	        }
	        
	        int result[] =new int[union.size()];
	        int r=0;
	        for(int num:union) 
	        {
	        	result[r++]=num;
	        }
	        System.out.println(Arrays.toString(result));
	}
	
}
