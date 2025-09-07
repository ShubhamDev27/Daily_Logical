package Level_1;

import java.util.Scanner;

public class divisible_by_3_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the num: ");
		int num= sc.nextInt();
		
		if(num%3==0 && num%7==0) 
		{
			System.out.println("funbuzz");
		}
		else if(num%3==0)
		{
		    System.out.println("fun");
		}
		else if(num%7==0) 
		{
			System.out.println("buzz");
		}
		  			
		
	}
}
