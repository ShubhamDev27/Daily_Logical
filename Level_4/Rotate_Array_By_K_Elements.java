package Level_4;

import java.util.Arrays;

public class Rotate_Array_By_K_Elements {

	public static void main(String[] args) {
		int [] arr = {1,5,7,8,2,6,8,9,11};
	    int k=2;
	    int start=0,end=arr.length-1;
	    Revrse(arr,start,end);
	    Revrse(arr,start,k-1);
	    Revrse(arr,k,end);
	    
	    System.out.println(Arrays.toString(arr));
	    
	    
	}
	static int[] Revrse(int[] arr,int start,int end) 
	{
		while(start<end) 
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}
