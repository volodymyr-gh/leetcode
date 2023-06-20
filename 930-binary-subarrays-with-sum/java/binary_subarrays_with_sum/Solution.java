package binary_subarrays_with_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,0,1,0,1};
        int res1 = new Solution().numSubarraysWithSum(nums1, 2);
        assert res1 == 4;

        int[] nums2 = {0,0,0,0,0};
        int res2 = new Solution().numSubarraysWithSum(nums2, 0);
        assert res2 == 15;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);
        int res = 0;
        int curr = 0;
        for (int num : nums) {
            curr += num;
            if (sums.containsKey(curr - goal)) {
                res += sums.get(curr - goal);
            }
            sums.put(curr, sums.getOrDefault(curr, 0) + 1);
        }

        return res;
    }
}
