package Level_4;

public class Check_Array_is_Sorted {

	public static void main(String[] args) {
        int[] arr = {1, 2, 13, 4, 5};   // ascending → true

        boolean asscending=true;
        for(int i=0;i<arr.length-1;i++) 
        {
        	if(arr[i]>arr[i+1]) 
        	{
        		asscending=false;
        		break;
        	}
        }
        if(asscending) 
        {
        	System.out.println("sorted");
        }
        else 
        {
        	System.out.println("not-sorted");
        }
	}
}
