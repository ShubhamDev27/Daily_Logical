package Level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Highest_and_SecondHighest {

	public static void main(String[] args) {
		
	    int arr []= {5,8,9,4,7,6,3};
        int highest= Integer.MIN_VALUE;
        int s_highest=Integer.MIN_VALUE;
        
        for(int num : arr) 
        {
        	  if(num> highest) 
        	  {
        		  s_highest=highest;
        		  highest=num;
        	  }
        	  else if(num>s_highest && num!= highest) 
        	  {
        		  s_highest=num;
        	  }
        }
       
        System.out.println("highest is :"+highest+"second highest"+s_highest);
 }}
