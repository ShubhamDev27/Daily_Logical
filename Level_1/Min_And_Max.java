package Level_1;

public class Min_And_Max {

public static void main(String[] args) {
		
	    int arr[] = {9,3,9,4,5,516,7};
       int min=Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       
       for(int num:arr) 
       {
    	   if(num<min) 
    	   {
    		   min=num;
    	   }
    	   if(num>max) 
    	   {
    		   max=num;
    	   }
       }
        
        System.out.println(min+" "+max);
  }
	
}
