// 1 - Iterative, extra space

class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            result[i] = curSum;
        }
        return result;
    }
}

/** 
 * Big-O
 * - Time complexity: O(n) - iterate through all elements in nums
 * - Space complexity: O(n) - new result array
 */