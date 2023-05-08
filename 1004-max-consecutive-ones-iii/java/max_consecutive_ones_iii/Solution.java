package max_consecutive_ones_iii;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int res = new Solution().longestOnes(nums, 2);
        assert res == 6;
    }

    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int currZeroCount = 0;
        int res = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                currZeroCount++;
            }

            while (currZeroCount > k) {
                if (nums[i] == 0) {
                    currZeroCount--;
                }
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
