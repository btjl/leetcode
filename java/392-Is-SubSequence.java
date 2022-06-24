// 1 - Two-Pointers

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int sIndex = 0;
        char curChar = s.charAt(sIndex);
        for (int i = 0; i < t.length(); i++) {
            
            if (curChar == t.charAt(i)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
                curChar = s.charAt(sIndex);
            }
        }
        return false;
    }
}

/**
 * Big-O
 * - Time complexity: O(T) - We might need to iterate through all elements of t before discovering that s is not a subsequence of t.
 * - Space complexity: O(1) - We do not use any auxiliary data structures.
 */