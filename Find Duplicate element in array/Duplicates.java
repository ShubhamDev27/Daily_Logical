package Logic;


public class Duplicates
{
	public static void check(int[] arr) 
	{
		int cnt = 0;
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j =i+1;j<=arr.length-1;j++) 
			{
				if(arr[i] == arr[j]) 
				{
					cnt++;
				}	
			
			}			
		}
		
    	System.out.println("duplicates" +cnt); 

				
	}
	
	public static void main(String[] args) 
	{
		int[] arr ={1,0,7,9,2,0,1};
		
		Duplicates s1 = new Duplicates();
		check(arr);		
	}
}
