package GFG_Level_3;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        
        String s ="010111010";
        int count=0;
        int maxCount=0;
        if (s == null || s.isEmpty())
         {
        	 System.out.println("0");
         }
               
        for(int i=0;i<s.length();i++) 
        {
        	if(s.charAt(i)=='1') 
        	{
        		count++;
        	}
        	else 
        	{
        		if(count>maxCount) 
        		{
            		maxCount=count;
        		}
        		count=0;
        	}
        	
        }
                System.out.println(maxCount);; 

       }    
    }
