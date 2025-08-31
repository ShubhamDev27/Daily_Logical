package Seperate_the_Array;

import java.util.Arrays;

public class Even_odd_seprate_in_array {

	public static void main(String[] args) {
	int arr[]= {1,5,4,7,6,3,44,58,9,6,7};
		
		int start=0,end=arr.length-1;
		while(start<=end) 
		{
			while(start<=end && arr[start]%2==0) 
			{
				start++;
			}
			while(start<=end && arr[end]%2!=0) 
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
