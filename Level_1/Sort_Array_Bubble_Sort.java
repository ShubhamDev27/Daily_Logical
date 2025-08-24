package Level_1;

import java.util.Arrays;

public class Sort_Array_Bubble_Sort {
 
	
	  public static void main(String[] args) {
		  
	    int arr []= {5,8,9,4,7,6,3};
	    int temp;
	    
	    for(int i=0;i<arr.length-1;i++) 
	    {
	    	   boolean flag=false;
	    	   for(int j=0;j<arr.length-1-i;j++) 
	    	   {
	    		   if(arr[j]>arr[j+1]) 
	    		   {
	    			   temp=arr[j];
	    			   arr[j]=arr[j+1];
	    			   arr[j+1]=temp;
	    			   flag =true;
  		   } 
	    		   
	    	   }
	    	   if(!flag) 
	    	   {
	    		   break;
	    	   }
	    }
	    System.out.println(Arrays.toString(arr));
	  }
	  
	}
		  
	// Explanation:
	//Step 1: Tum har element ko uske agle element se compare karte ho.
	//
	//Step 2: Agar order galat hai (yaha arr[j] > arr[j+1] for ascending), toh swap karte ho.
	//
	//Step 3: Har iteration me ek bada element array ke end me chala jata hai.
	//
	//Step 4: Agle pass me last wale element ko ignore karte ho kyunki wo already sahi position pe hai.
	//swapped flag:
	//Agar ek pass me koi swap nahi hua → iska matlab array pehle se sorted hai.
	//Toh hum break karke sorting jaldi finish kar dete hain.
	//Efficiency → Worst case O(n²) same rahta hai, lekin already sorted ya nearly sorted data me bahut fast ho jata hai


//                 Case	     Time 	Space 	
//                Best	     O(n) (optimized) / O(n²) 
//                Average	O(n²)	O(1)	             
//                  Worst	O(n²)	O(1)	
