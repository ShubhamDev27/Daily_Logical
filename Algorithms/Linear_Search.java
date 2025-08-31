package Algorithms;

public class Linear_Search {
  
	public static void main(String[] args) {
		int arr []= {8,9,6,2,4,7,3};
		int key=7;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==key) 
			{
				System.out.println("found at index :"+i);
			}
		}
	}
}
