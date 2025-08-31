package Algorithms;
import java.util.Arrays;

public class Selection_Sort {
  
	public static void main(String[] args) {
		
        int arr[] = {2, 15, 3, 18, 7, 20, 11, 21, 4, 9};
        
        for(int i=0;i<arr.length-1;i++) 
        {
        	    int minIndex = i;
        	   for(int j=i+1;j<arr.length;j++) 
        	   {
        		   if(arr[j]<arr[minIndex]) 
        		   {
        			   minIndex =j;
        		   }
        	   }
        	   int temp=arr[minIndex];
        	   arr[minIndex]=arr[i];
        	   arr[i]=temp;
        }
        
        System.out.println(Arrays.toString(arr));
	}
}
// there is one difference between selection sort and bubble sort ie.
// from first for loop we have to write int minIndex=i; in selection sort
//  and boolean flag=true in bubble sort. 