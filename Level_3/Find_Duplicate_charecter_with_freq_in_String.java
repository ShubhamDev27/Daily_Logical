package GFG_Level_3;

import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate_charecter_with_freq_in_String {

	public static void main(String[] args) {
		String str= "Welcome to java";
		
		Map<Character,Integer> freq = new HashMap<>();
		
		for(char ch : str.toCharArray()) 
		{
			if(ch!=' ') 
			{
				freq.put(ch,freq.getOrDefault(ch,0)+1);
			}
		}
		
		System.out.print("Duplicates are: ");
		for (Character ch : freq.keySet()) {
		    int count = freq.get(ch);          // get the frequency
		    if (count > 1) {
		        System.out.print(ch + "(" + count + ") ");  // print key + frequency
		    }
		}
		
		//System.out.println(freq);
	}
}
