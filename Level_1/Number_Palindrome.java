package Level_1;

import java.util.Scanner;

public class Number_Palindrome {
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter num to check palindrome or not :");
	  int num = sc.nextInt();
	  int temp=num;
	  int rev =0;
	  while(num!=0) 
	  {
		  int digit = num%10;
		  rev=rev*10+digit;
		  num=num/10;
	  }
	  System.out.println("Reversed num:"+rev);
	  if(temp==rev) 
	  {
		  System.out.println("palindrome !");
	  }
	  else 
	  {
		  System.out.println("not palindrome !");

	  }
}
}
