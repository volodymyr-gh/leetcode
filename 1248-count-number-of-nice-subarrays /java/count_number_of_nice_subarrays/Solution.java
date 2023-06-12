package count_number_of_nice_subarrays;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1,1,2,1,1 };
        int res1 = new Solution().numberOfSubarrays(nums1, 3);
        assert res1 == 2;

        int[] nums2 = { 2,4,6 };
        int res2 = new Solution().numberOfSubarrays(nums2, 1);
        assert res2 == 0;

        int[] nums3 = { 2,2,2,1,2,2,1,2,2,2 };
        int res3 = new Solution().numberOfSubarrays(nums3, 2);
        assert res3 == 16;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int res = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                curr++;
            }
            res += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return res;
    }
}
