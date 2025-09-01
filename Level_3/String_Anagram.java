package GFG_Level_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String_Anagram {

	public static void main(String[] args) {
		
		String s1 ="silent";
		String s2 ="listen";
		Map<Character,Integer> map =new HashMap<>();
		if(s1.length()!=s2.length()) 
		{
			System.out.println("not anagram");
		}
		for(char ch:s1.toCharArray()) 
		{
			if(ch!=' ') 
			{
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
		}
		for(char ch: s2.toCharArray()) 
		{
			if (!map.containsKey(ch)) { // char not present in s1
		        System.out.println("not-Anagram !");
		        return;
			} 		
	           map.put(ch, map.get(ch) - 1);
	           if (map.get(ch) == 0) map.remove(ch);
	   
		}
		
		if(map.isEmpty()) 
		{
			System.out.println("Anagram !");
		}
		else 
		{
			System.out.println("not-Anagram !");
		}
		
		
		
		//Brute force ----------------------------
		
	
		String s3 = "listen";
		String s4 = "silent";
		
		if(s3.length()!=s4.length()) 
		{
			System.out.println("not anagram");
		}
		char arr1 []= s1.toCharArray();
		char arr2 []=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) 
		{
			System.out.println("anagram");
		}
		
		
	}
}
