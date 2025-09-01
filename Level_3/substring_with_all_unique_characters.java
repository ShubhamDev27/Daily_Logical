package GFG_Level_3;

import java.util.HashSet;
import java.util.Set;

public class substring_with_all_unique_characters {
    public static void main(String[] args) {
        String str = "abcabcbb";

        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            // If duplicate → shrink from left until removed
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch); // insert new char
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Longest substring length = " + maxLen);
    }
}













