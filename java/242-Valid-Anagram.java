// 1 - HashTable

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCounts.put(s.charAt(i), charCounts.getOrDefault(s.charAt(i), 0) + 1);
            charCounts.put(t.charAt(i), charCounts.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int charCount : charCounts.values()) {
            if (charCount != 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Big-O
 * - Time complexity: O(n) - Iterate over all the characters in both s and t
 * - Space complexity: O(n) - HashTable stores all the characters found in s and t 
 */