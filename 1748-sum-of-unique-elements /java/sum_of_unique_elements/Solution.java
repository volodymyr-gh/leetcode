package sum_of_unique_elements;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2};
        int res1 = new Solution().sumOfUnique(nums1);
        assert res1 == 4;

        int[] nums2 = {1,1,1,1,1};
        int res2 = new Solution().sumOfUnique(nums2);
        assert res2 == 0;

        int[] nums3 = {1,2,3,4,5};
        int res3 = new Solution().sumOfUnique(nums3);
        assert res3 == 15;
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for (int num : nums) {
            if (counts.get(num) == 1) {
                res += num;
            }
        }

        return res;
    }
}
