package Level_2;

import java.util.Arrays;

public class Sort_Array_Odd_Even_seprate {

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
		
		
//		int arr1 []=new int[arr.length];
//		int index=0;
//		for(int n:arr) 
//		{
//			if(n%2==0) 
//			{
//				arr1[index++]=n;
//			}
//		}
//		for(int n:arr) 
//		{
//			if(n%2!=0) 
//			{
//				arr1[index++]=n;
//			}
//		}
//		System.out.println(Arrays.toString(arr1));
	}
}
