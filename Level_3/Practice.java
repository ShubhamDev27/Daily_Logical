package GFG_Level_3;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        
        String s1 ="silent";
        String s2 ="listeo";
        Map<Character,Integer> map = new HashMap<>();
        
        if(s1.length() != s2.length()) {
            System.out.println("not anagram");
            return; // exit early
        }
        
        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch : s2.toCharArray()) {   // ✅ must be s2 here
            if(!map.containsKey(ch)) {      // char not found → definitely not anagram
                System.out.println("not-Anagram !");
                return;
            }
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        
        if(map.isEmpty()) {
            System.out.println("Anagram !");
        } else {
            System.out.println("not-Anagram !");
        }
    }
}