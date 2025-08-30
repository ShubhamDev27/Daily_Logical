package Level_2;


public class Max_sum_of_sub_Array {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int n = arr.length;
        
        int windowSum=0;
        for(int i=0;i<k;i++) 
        {
           	windowSum+=arr[i];
        }
        int maxSum=windowSum;
       // Slide the window through the array
        for(int i=k;i<n;i++) 
        {
        	  windowSum+=arr[i]-arr[i-k];// add next element, remove first element of previous window
        	  if(windowSum > maxSum) 
        	  {
        		  maxSum=windowSum;
        	  }
        }
      System.out.println("Maximum sum of " + k + " consecutive elements = " + maxSum);
      
      
     }
}
