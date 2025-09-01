package GFG_Level_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Find_Duplicate_Charecter_from_String {

	public static void main(String[] args) {

      String str = "Hello world";
      Set<Character> seen = new LinkedHashSet<>();
      Set<Character> duplicate = new LinkedHashSet<>();

      for(char ch:str.toCharArray()) 
      {
    	  if(ch!=' ' && !seen.add(ch)) 
    	  {
    		  duplicate.add(ch);
    	  }
      }
      System.out.println("Unique are :"+duplicate);
	}
	
}
