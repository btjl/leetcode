// 1 - HashTable, HashSet

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> replacementMapping = new HashMap<>();
        Set<Character> tCharSeen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            Character replacementValue = replacementMapping.getOrDefault(sChar, null);

            if ((replacementValue != null && replacementValue != tChar) || 
                (replacementValue == null && tCharSeen.contains(tChar))) {
                return false;
            }

            replacementMapping.put(sChar, tChar);
            tCharSeen.add(tChar);
        }
        return true;
    }
}

/**
 * Big-O
 * - Time complexity: O(n), since both s and t are guaranteed to have equal lengths we must iterate over all their characters
 * - Space complexity: O(n), since we might have to store n mappings in the hashtable, and n characters in the hashset
 */