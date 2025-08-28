package Logic;

import java.util.Scanner;

public class Sum_Element 
{
	public static void check(int[] arr) 
	{
		int temp=0;
		 for(int i = 0;i<arr.length;i++) 
		 {
			 temp = arr[i]+temp;
		 }
		System.out.println("sum of element is"+" "+temp);
	}
	
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	
	int n = sc.nextInt();
	System.out.println("Enter"+n+"element");
	int[] arr= new int[n];
	for(int i=0;i<n;i++) 
	{
		arr[i]=sc.nextInt();
		
	}
	check(arr);
  }
}
