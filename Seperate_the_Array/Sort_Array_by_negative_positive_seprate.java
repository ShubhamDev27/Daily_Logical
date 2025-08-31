package Seperate_the_Array;

import java.util.Arrays;

public class Sort_Array_by_negative_positive_seprate {
public static void main(String[] args) {
	int arr []= {-19,54,24,-35,-6,-9,55};
	int left=0; int right=arr.length-1;
	int temp=0;
	while(left<right) 
	{
		while(left<right && arr[left]<0) 
		{
			left++;
		}
		while(left<right && arr[right]>=0) 
		{
			right--;
		}
		if(left<right) 
		{
			temp=arr[left];
		    arr[left]=arr[right];
		    arr[right]=temp;	 
		}
		 
	}
	System.out.println(Arrays.toString(arr));
     
  }
}
  
