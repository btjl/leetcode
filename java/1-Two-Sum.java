// 1 - HashTable

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementIndices = new HashMap<>();

        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (complementIndices.containsKey(complement)) {
                return new int[] {complementIndices.get(complement), i};
            }
            complementIndices.put(nums[i], i);
        }
        return null;
    }
}

/**
 * Big-O
 * - Time complexity: O(n) - Iterate through all the elements in given nums array
 * - Space complexity: O(n) - HashTable has n - 1 entries if the pair adding up to target is found at the last element of the given nums array
 */