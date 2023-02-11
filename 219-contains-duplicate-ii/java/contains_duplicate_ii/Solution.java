package contains_duplicate_ii;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        boolean res1 = new Solution().containsNearbyDuplicate(nums1, 3);
        assert res1 == true;

        int[] nums2 = { 1, 0, 1, 1 };
        boolean res2 = new Solution().containsNearbyDuplicate(nums2, 1);
        assert res2 == true;

        int[] nums3 = { 1, 2, 3, 1, 2, 3 };
        boolean res3 = new Solution().containsNearbyDuplicate(nums3, 2);
        assert res3 == false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (!seen.containsKey(curr)) {
                seen.put(curr, i);
                continue;
            }

            int diff = Math.abs(seen.get(curr) - i);
            if (diff <= k) {
                return true;
            } else {
                seen.put(curr, i);
            }
        }

        return false;
    }
}
