package Seperate_the_Array;

import java.util.Arrays;

public class Partitioning_with_pivot {
   public static void main(String[] args) {
	
	   int arr[]= {1,18,20,14,24,8,9,21,23,6};
	   int pivot=15;
	   int start =0;int end=arr.length-1;
	   
	   while(start<=end) 
	   {
		   while(start<=end && arr[start]<pivot) 
		   {
			   start++;
		   }
		   while(start<=end && arr[end]>=pivot) 
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
