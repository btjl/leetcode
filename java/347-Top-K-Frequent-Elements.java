// 1 - HashTable, BucketSort

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            int count = numCount.getOrDefault(num, 0);
            numCount.put(num, count + 1);
        }

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] countGroups = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            int countIndex = entry.getValue();
            if (countGroups[countIndex] == null) {
                countGroups[countIndex] = new ArrayList<>();
            }
            countGroups[countIndex].add(entry.getKey());
        }

        int addIndex = 0;
        int[] result = new int[k];
        for (int i = countGroups.length - 1; i > -1; i--) {
            List<Integer> group = countGroups[i];
            if (group != null) {
                for (int j = group.size() - 1; j > -1; j--) {
                    result[addIndex] = group.get(j);
                    addIndex++;

                    if (addIndex == k) {
                        return result;
                    }
                }
            }
        }
        return null;
    }
}

/**
 * Big-O
 * - Time complexity: O(n) - Iterate through all elements in nums. Nested for-loop at the end will at most process n elements as well.
 * - Space complexity: O(n) - Hashtable to store all the elements in nums.
 */