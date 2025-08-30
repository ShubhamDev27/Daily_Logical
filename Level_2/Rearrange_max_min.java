package Level_2;

import java.util.Arrays;

public class Rearrange_max_min {
   public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5, 6, 7};
       int result[]= new int[arr.length];
       int left=0,right=arr.length-1;
       
       boolean pickMax=true;
       int index=0;
       while(left<=right) 
       {
    	     if(pickMax) 
    	     {
    	    	 result[index++]=arr[right--];
    	     }
    	     else 
    	     {
    	    	 result[index++]=arr[left++];
    	     }
    	     pickMax=!pickMax;
       }
       System.out.println(Arrays.toString(result));

}
}
