package GFG_Level_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Find_Unique_from_string {
	
	static Set<Character> Unique(String str)
	{
		Set<Character> unique = new LinkedHashSet<>();
		for(char ch: str.toCharArray()) 
		{
			if(ch!=' ') 
			{
			unique.add(ch);

			}
		}
		return unique;
	}
	
   public static void main(String[] args) {
	    String str = "Hello World";
	   Set<Character> result = Unique(str);
	   System.out.println(result);
	   
 }
}
