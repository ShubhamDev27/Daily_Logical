package Level_1;

import java.util.Scanner;

public class Factorial_from_given_num {
  public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	   System.out.println("Enter num :");
	    int num =sc.nextInt();
	    int fact=1;
	    for(int i=1;i<=num;i++) 
	    {
	    	  fact=fact*i;
	  	 System.out.print(fact+",");

	    }
}
}
