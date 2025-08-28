package Logic;

import java.util.Scanner;

public class ThatManyPrime 
{
	public static void Check(int a) 
	{
		int count =0;
		int n=a+1;
		while(a!=count) 
		{
			boolean b= true;
			for(int i=2;i<n;i++) 
			{
				if(n%i ==0) 
				{
					b=false;
					break;
				}
			}
			if(b) 
			{
				System.out.println(n+",");
				count++;

			}
			n++;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the num:");
		int a = sc.nextInt();
		
		Check(a);
		
	}

}
