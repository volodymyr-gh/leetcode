package k_radius_subarray_averages;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 7,4,3,9,1,8,5,2,6 };
        int[] res1 = new Solution().getAverages(nums1, 3);
        assert res1.length == 9;
        assert res1[0] == -1;
        assert res1[1] == -1;
        assert res1[2] == -1;
        assert res1[3] == 5;
        assert res1[4] == 4;
        assert res1[5] == 4;
        assert res1[6] == -1;
        assert res1[7] == -1;
        assert res1[8] == -1;

        int[] nums2 = { 100000 };
        int[] res2 = new Solution().getAverages(nums2, 0);
        assert res2.length == 1;
        assert res2[0] == 100000;

        int[] nums3 = { 8 };
        int[] res3 = new Solution().getAverages(nums3, 100000);
        assert res3.length == 1;
        assert res3[0] == -1;
    }

    public int[] getAverages(int[] nums, int k) {
        int len = nums.length;

        int[] res = new int[len];
        Arrays.fill(res, -1);

        long currSum = 0;

        for (int i = 0; i < len; i++) {
            int j = i - (k * 2);

            currSum += nums[i];
            if (j > 0) {
                currSum -= nums[j-1];
            }

            if (j < 0) {
                continue;
            }

            res[i-k] = (int) (currSum / (k * 2 + 1));
        }

        return res;
    }
}
