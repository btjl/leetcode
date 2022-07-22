// 1 - Prefix, Postfix sums

class Solution {
    public int pivotIndex(int[] nums) {
        int ARRAY_LENGTH = nums.length;

        int[] leftRollingSums = new int[ARRAY_LENGTH];
        int[] rightRollingSums = new int[ARRAY_LENGTH];

        leftRollingSums[0] = nums[0];
        rightRollingSums[ARRAY_LENGTH - 1] = nums[ARRAY_LENGTH - 1];

        for (int i = 1; i < ARRAY_LENGTH; i++) {
            leftRollingSums[i] = leftRollingSums[i - 1] + nums[i];
            rightRollingSums[ARRAY_LENGTH - 1 - i] = rightRollingSums[ARRAY_LENGTH - i] + nums[ARRAY_LENGTH - 1 -i];
        }

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (leftRollingSums[i] == rightRollingSums[i]) {
                return i;
            }
        }

        return -1;
    }
}

/*
 * Big-O
 * - Time complexity: O(n) - Iterate through all the elements of nums array
 * - Space complexity: O(n) - Two auxiliary array to store the prefix and postfix rolling sums of nums
 */