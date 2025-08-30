package Level_2;

public class Find_Sum_and_Average_ofArray {
   public static void main(String[] args) {
		int arr[]= {1,3,4,5,9,15,18,20} ; 
       int sum=0;
       
       for(int i=0;i<arr.length;i++) 
       {
    	     sum+=arr[i];
       }
       double average = (double)sum/arr.length;
	  System.out.println("the sum is: "+sum+" and Average is: "+average);
	  
   }
}
