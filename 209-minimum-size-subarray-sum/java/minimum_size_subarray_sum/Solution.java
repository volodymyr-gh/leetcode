package minimum_size_subarray_sum;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 1, 2, 4, 3 };
        int res1 = new Solution().minSubArrayLen(7, nums1);
        assert res1 == 2;

        int[] nums2 = { 1, 4, 4 };
        int res2 = new Solution().minSubArrayLen(4, nums2);
        assert res2 == 1;

        int[] nums3 = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int res3 = new Solution().minSubArrayLen(11, nums3);
        assert res3 == 0;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int curr = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            curr += nums[i];
            while (curr >= target) {
                minLen = Math.min(minLen, i - j + 1);
                curr -= nums[j];
                j++;
            }
            i++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
