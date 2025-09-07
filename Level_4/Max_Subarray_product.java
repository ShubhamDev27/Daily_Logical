package Level_4;

public class Max_Subarray_product {

	public static void main(String[] args) {
		int arr[] = {2,3,-2,4};
		int currMin=arr[0];
		int currMax=arr[0];
		int globalMax=arr[0];
		
        for (int i = 1; i < arr.length; i++) {
		
        	int num=arr[i];
			int temp=currMax;
			currMax=Math.max(num, Math.max(num*currMax, num*currMin));

			currMin=Math.min(num, Math.min(num*temp,num*currMin));
			
			if(currMax>globalMax) 
			{
				globalMax=currMax;
			}
		}
		System.out.println(globalMax);
	}
}
