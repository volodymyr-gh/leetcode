package largest_unique_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 5,7,3,9,4,9,8,3,1 };
        int res1 = new Solution().largestUniqueNumber(nums1);
        assert res1 == 8;

        int[] nums2= { 9,9,8,8 };
        int res2 = new Solution().largestUniqueNumber(nums2);
        assert res2 == -1;
    }

    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        int largest = -1;
        for (int n : counts.keySet()) {
            if (counts.get(n) == 1 && n > largest) {
                largest = n;
            }
        }

        return largest;
    }
}
