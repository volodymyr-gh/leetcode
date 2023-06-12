package subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1,1,1 };
        int res1 = new Solution().subarraySum(nums1, 2);
        assert res1 == 2;

        int[] nums2 = { 1,2,3 };
        int res2 = new Solution().subarraySum(nums2, 3);
        assert res2 == 2;
    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int res = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            res += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return res;
    }
}
