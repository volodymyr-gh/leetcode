package number_of_ways_to_split_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 10, 4, -8, 7 };
        int res1 = new Solution().waysToSplitArray(nums1);
        assert res1 == 2;

        int[] nums2 = { 2, 3, 1, 0 };
        int res2 = new Solution().waysToSplitArray(nums2);
        assert res2 == 2;

        int[] nums3 = { 0, 0 };
        int res3 = new Solution().waysToSplitArray(nums3);
        assert res3 == 1;
    }

    public int waysToSplitArray(int[] nums) {
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }

        long total = prefixSum[nums.length - 1];
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (prefixSum[i] >= total - prefixSum[i]) {
                res++;
            }
        }

        return res;
    }
}
