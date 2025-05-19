package Logic;

import java.util.Scanner;

public class Average_Element
{
	public static void check(int[] arr) 
	{
		int temp=0;
		float avg=0;
		 for(int i = 0;i<arr.length;i++) 
		 {
				 temp=arr[i]+temp;
				 avg = temp/arr.length;
				 
			 
			 
		 }
		 System.out.println("Average of element is"+" "+avg);
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter"+n+"element");
		for(int i= 0;i<n;i++)
		{
			arr[i]=sc.nextInt();		
		}
		check(arr);
	}

}
