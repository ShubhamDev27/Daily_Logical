package Seperate_the_Array;

import java.util.Arrays;

public class Seprate_Multiple_of_K {
    public static void main(String[] args) {
 	   int arr[]= {1,18,20,14,24,8,9,21,23,6};
 	   int k=3;
 	   int start =0; int end=arr.length-1;
 	   while(start<end) 
 	   {
 		   while(start<end && arr[start]%k==0) 
 		   {
 			   start++;
 		   }
 		  while(start<end && arr[end]%k!=0) 
		   {
			   end--;
		   }
 		  if(start<end) 
 		  {
 			  int temp=arr[start];
 			  arr[start]=arr[end];
 			  arr[end]=temp;
 			  start++;
 			  end--;
 			  
 		  }
 	   }
 	   System.out.println(Arrays.toString(arr));
	}
}
