package Algorithms;

public class Binary_Search_Recursive{

   static int Binarysearch(int arr[],int key,int start,int end) 
   {
	   if(start>end) 
	   {
		   return -1;
	   }
	   int mid=(start+end)/2;
	  
		   if(arr[mid]==key) 
		   {
			   return mid;
		   }
		   else if(key<arr[mid]) 
		   {
			   return Binarysearch(arr,key,start,mid-1);
		   }
		   else 
		   {
			   return Binarysearch(arr,key,mid+1,end);
		   }
	  
   }
   public static void main(String[] args) {
	int arr[]= {1,3,4,5,9,15,18,19} ;
	int key=15;
	   int start=0,end=arr.length;

	int result = Binarysearch(arr,key,start,end);
	System.out.println("found at index "+result);
}
}
