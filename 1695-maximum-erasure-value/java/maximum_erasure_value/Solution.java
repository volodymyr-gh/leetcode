package maximum_erasure_value;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4,2,4,5,6};
        int res1 = new Solution().maximumUniqueSubarray(nums1);
        assert res1 == 17;

        int[] nums2 = {5,2,1,2,5,2,1,2,5};
        int res2 = new Solution().maximumUniqueSubarray(nums2);
        assert res2 == 8;
    }

    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        int res = 0;
        int curr = 0;
        int right = 0;
        int left = 0;
        while (right < nums.length) {
            int rightNum = nums[right];
            curr += rightNum;
            seen.put(rightNum, seen.getOrDefault(rightNum, 0) + 1);
            while (seen.get(rightNum) > 1) {
                int leftNum = nums[left];
                seen.put(leftNum, seen.get(leftNum) - 1);
                curr -= leftNum;
                left++;
            }
            res = Math.max(res, curr);
            right++;
        }

        return res;
    }
}
