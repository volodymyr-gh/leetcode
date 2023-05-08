package minimum_value_to_get_positive_step_by_step_sum;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { -3, 2, -3, 4, 2 };
        int res1 = new Solution().minStartValue(nums1);
        assert res1 == 5;

        int[] nums2 = { 1, 2 };
        int res2 = new Solution().minStartValue(nums2);
        assert res2 == 1;

        int[] nums3 = { 1, -2, -3 };
        int res3 = new Solution().minStartValue(nums3);
        assert res3 == 5;
    }

    public int minStartValue(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }

        int res = 1;
        for (int i = 0; i < prefixSum.length; i++) {
            if (prefixSum[i] < 1) {
                res = Math.max(res, 1 - prefixSum[i]);
            }
        }

        return res;
    }
}
