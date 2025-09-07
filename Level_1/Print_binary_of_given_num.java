package Level_1;

import java.util.Scanner;
import java.util.Stack;

public class Print_binary_of_given_num {
   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   Stack<Integer> stk =new Stack<>();
	   
	   System.out.println("Enter num :");
	    int num =sc.nextInt();
	    while(num!=0) 
	    {
	    	  int digit = num%2;
	    	  stk.push(digit);
	    	  num=num/2;
	    }
	    while(!stk.isEmpty()) 
	    {
	    	  System.out.println(stk.pop());
	    }
  }
}
