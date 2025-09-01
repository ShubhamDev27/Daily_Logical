package GFG_Level_3;

import java.util.HashMap;
import java.util.Map;

public class Find_Max_Freq_of_char {

	public static void main(String[] args) {
        String str = "successes";
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch:str.toCharArray()) 
        {
        	if(ch!=' ') 
        	{
        		freq.put(ch,freq.getOrDefault(ch,0)+1);
        		
        	}
        }
        
        int maxCount=0;
        char maxChar=' ';
        for(char ch:freq.keySet()) 
        {
        	if(freq.get(ch)>maxCount) 
        	{
        		maxCount = freq.get(ch);
        		maxChar = ch;
        	}
        }
        System.out.println("Max count for "+maxChar+" is"+maxCount);

	}
}
