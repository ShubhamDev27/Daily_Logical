package GFG_Level_3;

public class Traping_Rain_Water_Problem {

	public static void main(String[] args) {
		int height []= {0,1,0,2,1,0,1,3,2,1,2,1};

		int left=0,right=height.length-1;
		int maxLeft=0,maxRight=0;
		int water=0;
		
		while(left<=right) 
		{
			if(height[left]<=height[right]) 
			{
				if(height[left]>= maxLeft) 
				{
					maxLeft=height[left];
				}
				else 
				{
					water+=maxLeft-height[left];
				}
				left++;
			}
			else 
			{
				if(height[right]>= maxRight) 
				{
					maxRight=height[right];
				}
				else 
				{
					water+=maxRight-height[right];
				}
				right--;
			}
		}
        System.out.println("Trapped Water = " + water);

	}
}
