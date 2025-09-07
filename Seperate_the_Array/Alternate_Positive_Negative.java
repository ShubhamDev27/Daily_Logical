package Seperate_the_Array;

import java.util.Arrays;

public class Alternate_Positive_Negative {

    public static void main(String[] args) {
        int arr[] = {2, 3, -4, -1, 6, -9, -2, 4};

        rearrange(arr);

        System.out.println("Array after rearranging: " + Arrays.toString(arr));
    }

    // Rearrange positives and negatives alternately
    public static void rearrange(int[] arr) {
        int start=0,end = arr.length-1;
        int n=arr.length;
        while(start<=end) 
        {
        	while(start<=end && arr[start]<0)
        	{
        		start++;
        	} 
           while(start<=end && arr[end]>=0)
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
        // Step 1: Partition negatives and positives
        int neg = 0, pos = end+1;
        // Step 2: Interleave negatives and positives
        while (neg < pos && pos < n && arr[neg] < 0) {
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            neg += 2;
            pos++;
        }
    }
}
