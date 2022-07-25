// 1 - Prefix, Postfix sums

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int prevSum = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prevSum;
            prevSum *= nums[i];
        }

        prevSum = 1;
        for (int i = nums.length - 1; i > -1; i--) {
            result[i] *= prevSum;
            prevSum *= nums[i];
        }

        return result;
    }
}

/**
 * Big-O
 * - Time complexity: O(n) - Iterate through all elements in nums two times.
 * - Space complexity: O(1) - According to the question, the output array does not count as extra space.
 */