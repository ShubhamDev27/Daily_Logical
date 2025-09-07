package GFG_Level_3;

import java.util.Arrays;

public class Merge_two_Sorted_Array {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,0,0,0};
		int arr2[]= {6,7,8};
		int m=5;
		int n=3;
		
		int i=m-1,j=n-1,k=m+n-1;
		while(i>=0 && j>=0) 
		{
			if(arr1[i]>arr2[j]) 
			{
				arr1[k--]=arr1[i--];
			}
			else 
			{
				arr1[k--]=arr2[j--];
			}
		}
		while(j>=0) 
		{
			arr1[k--]=arr2[j--];
		}
		System.out.println(Arrays.toString(arr1));

	}
}
