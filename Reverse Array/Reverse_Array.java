package Logic;

import java.util.Scanner;

public class Reverse_Array 
{
	public static void check(int[] arr) 
	{  int j=0;
		int[] rev = new int[arr.length];
		for(int  i=arr.length-1;i>=0;i--) 
		{
			rev[j]=arr[i];
			j++;
		}
		
	    for(int num:rev)
	    {
	    	System.out.println(num+" ");
	    }
	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
        int[] arr = new int[n];

		System.out.println("Enter"+""+n+" "+"numbers:");

		for(int i =0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		check(arr);
		
	
		
		
	}

}
