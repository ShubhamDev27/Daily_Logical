package Level_1;

import java.util.Scanner;

public class odd_even_check_without_Modulo {
	
     public static void main(String[] args) {
		System.out.println("Enter num to :");
        Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
       
		while(num>0) 
		{
			num=num-2;
		}
		if(num==0) 
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}
		
		
		///
		if((num & 1)==0) 
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}
	}

	 
}
