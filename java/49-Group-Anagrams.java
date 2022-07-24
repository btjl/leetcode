// 1 - HashTable, Sort

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sortedStr(str);
            List<String> group = anagramGroups.getOrDefault(sortedStr, new ArrayList<>());
            group.add(str);
            anagramGroups.put(sortedStr, group);
        }

        return new ArrayList<List<String>>(anagramGroups.values());
    }

    public static String sortedStr(String str) {
        char[] charsArray = str.toCharArray();
        Arrays.sort(charsArray);
        return new String(charsArray);
    }
}

/**
 * Big-O
 * - Time complexity: O(nklogk), where k is the length of the longest string present in strs. Iterate through and sort all strings in strs array.
 * - Space complexity: O(nk) - when all strings are unique we will have n sorted strings as keys, each with a list of size 1 comprising of themselves (unsorted)
 */