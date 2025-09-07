package GFG_Level_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_First_Non_Reapiting_Char {
    public static void main(String[] args) {
		
        String str = "loveleetcode";
        Map<Character, Integer> freq = new LinkedHashMap<>(); // maintains insertion order

        
        for(char ch:str.toCharArray()) 
        {
        	if(ch!=' ') 
        	{
        		freq.put(ch,freq.getOrDefault(ch, 0)+1);
        	}
        }
        
        for(char ch : freq.keySet()) 
        {
        	if(freq.get(ch)==1) 
        	{
        		System.out.println("first non reapting char "+ch);
        		break;	
        	}
        }

	}
}
