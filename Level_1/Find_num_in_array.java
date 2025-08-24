package Level_1;

public class Find_num_in_array {

	public static void main(String[] args) {
		
		int arr[]= {10,58,4,7,2,66,9};
		int key=10;
		boolean flag =false;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==key) 
			{
				flag= true;
				break;
			}
		}
		if(flag) 
		{
			System.out.println("num is in array !");
		}
		else
		{
			System.err.println("num not in array !");
		}
		
		//---------------------------------------------
		
		int[] arr1 = {10, 58, 4, 7, 2, 66, 9};
		int key1 = 10;
		boolean found = false;

		for (int num : arr1)
		{
		    if (num == key1)
		    {
		        found = true;
		        break;
            	}
		}
	}
}


 