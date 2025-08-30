package Level_2;

import java.util.Arrays;

public class Sort_Array_Odd_Even_seprate {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,9,15,18,20} ; 
		int arr1 []=new int[arr.length];
		int index=0;
		for(int n:arr) 
		{
			if(n%2==0) 
			{
				arr1[index++]=n;
			}
		}
		for(int n:arr) 
		{
			if(n%2!=0) 
			{
				arr1[index++]=n;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
