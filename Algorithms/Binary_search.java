package Algorithms;

public class Binary_search {

	static int Binary_Search(int arr[],int key) 
	{
	  int start=0,end=arr.length-1;
		while(start<=end) 
		{
			int mid = (start+end)/2;

			if(arr[mid]==key) 
			{
				return mid;
			}
			else if(key<arr[mid]) 
			{
				end =mid-1;
			}
			else 
			{
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,9,15,18,19} ;
		int key=15;

		int result = Binary_Search(arr,key);
		System.out.println("found at index "+result);
	}
	
}
