package Logic;

import java.util.Scanner;

public class Max_Element 
{
	public static void check(int[] arr) 
	{
		int temp=arr[0];
		
		for(int i = 1;i<arr.length;i++) 
		{
			if(temp<arr[i])
			{
				 temp=arr[i];
			} 			
		}	
		 System.out.println("Max element is"+" "+temp);
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr =new int[n];
		System.out.println("Enter"+n+"element");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();		
		}
		
		check(arr);
		
	}

}
