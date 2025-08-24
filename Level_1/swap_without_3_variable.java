package Level_1;

import java.util.Scanner;

public class swap_without_3_variable {
   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter 10 num :");
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    
	    num1=num1+num2;
	    num2=num1-num2;
	    num1=num1-num2;
	    System.out.println("after swaping"+num1+" "+num2);
	    num1=num1/num2;
	    num2=num1*num2;
	    num1=num1*num2;
	    System.out.println("after swaping"+num1+" "+num2);
	    num1=num1^num2;
	    num2=num1^num2;
	    num1=num1^num2;
	    System.out.println("after swaping"+num1+" "+num2);

}
}
