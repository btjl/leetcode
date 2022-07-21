// 1 - HashSet

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num: nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

/**
 * Big-O
 * - Time complexity: O(n) - Iterate through all elements in nums
 * - Space complexity: O(n) - HashSet may contain all elements in nums if we do not find a duplicate
 */