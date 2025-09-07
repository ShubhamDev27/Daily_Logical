package Level_1;

import java.util.Scanner;

public class All_prime_num_between_given_2_num {
   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter 2 num :");
	    int start =sc.nextInt();
	    int end =sc.nextInt();
	    
	    for(int i=start;i<=end;i++) 
	    {
	    	if(i<=1)
	    		continue;
	    	   boolean isprime=true;
	    	  for(int j=2;j<=Math.sqrt(i);j++) 
	    	  {
	    		  if(i%j==0) 
		    	   {
	    			  isprime=false;
	    			  break;
		    	   }
	    	  }
	    	  if(isprime) 
	    	  {
		    	   System.out.println(i+",");
	    	  }
	    }
}
}
