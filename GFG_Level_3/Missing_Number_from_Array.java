package GFG_Level_3;

public class Missing_Number_from_Array {

	public static void main(String[] args) {
        int[] arr = {3,0,1};

        int n=arr.length;
        int expextedSum=n*(n+1)/2;  //Formula for sum of first n natural numbers is n(n+1)/2
        int actualSum=0;
        for(int num:arr) 
        {
        	actualSum+=num;
        }
        System.out.println("missing number is "+(expextedSum-actualSum));
	}
}



