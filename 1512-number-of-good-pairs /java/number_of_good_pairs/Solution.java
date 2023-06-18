package number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,3};
        int res1 = new Solution().numIdenticalPairs(nums1);
        assert res1 == 4;

        int[] nums2 = {1,1,1,1};
        int res2 = new Solution().numIdenticalPairs(nums2);
        assert res2 == 6;

        int[] nums3 = {1,2,3};
        int res3 = new Solution().numIdenticalPairs(nums3);
        assert res3 == 0;
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for (int num : counts.keySet()) {
            int currNumCount = counts.get(num);
            res += currNumCount * (currNumCount - 1) / 2;
        }

        return res;
    }
}
