package two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 2, 7, 11, 15 };
        int[] res1 = new Solution().twoSum(arr1, 9);
        assert res1.length == 2;
        assert res1[0] == 0;
        assert res1[1] == 1;

        int[] arr2 = new int[] { 3, 2, 4 };
        int[] res2 = new Solution().twoSum(arr2, 6);
        assert res2.length == 2;
        assert res2[0] == 1;
        assert res2[1] == 2;

        int[] arr3 = new int[] { 3, 3 };
        int[] res3 = new Solution().twoSum(arr3, 6);
        assert res3.length == 2;
        assert res3[0] == 0;
        assert res3[1] == 1;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int complement = target - curr;
            int complementIndex = seen.getOrDefault(complement, -1);

            if (complementIndex > -1) {
                return new int[] { complementIndex, i };
            }

            seen.put(curr, i);
        }

        return null;
    }
}
