package Level_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Unique_Array {
    public static void main(String[] args) {
        
        int arr[] = {2, 15, 3, 15, 11, 20, 11, 21, 4, 4};
        
       Set<Integer> set = new LinkedHashSet<>();
       for(int num:arr) 
       {
    	     set.add(num);
       }
       
        System.out.println("Unique Array: "+set );
        
        
  // Brute Force---------------------------------------------------------
        
        int arr1[] = {2, 15, 3, 15, 11, 20, 11, 21, 4, 4};

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // check if arr[i] appeared before
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
    
    
}
