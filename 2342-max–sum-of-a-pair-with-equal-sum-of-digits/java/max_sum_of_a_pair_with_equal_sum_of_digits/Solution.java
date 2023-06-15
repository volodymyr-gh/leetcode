package max_sum_of_a_pair_with_equal_sum_of_digits;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 18,43,36,13,7 };
        int res1 = new Solution().maximumSum(nums1);
        assert res1 == 54;

        int[] nums2 = { 10,12,19,14 };
        int res2 = new Solution().maximumSum(nums2);
        assert res2 == -1;

        int[] nums3 = { 229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401 };
        int res3 = new Solution().maximumSum(nums3);
        assert res3 == 973;
    }

    public int maximumSum(int[] nums) {
        Map<Integer, Integer> allDigitSums = new HashMap<>();
        int res = -1;

        for (int num : nums) {
            int digitSum = 0;
            int curr = num;
            while (curr > 0) {
                digitSum += curr % 10;
                curr /= 10;
            }

            if (allDigitSums.containsKey(digitSum)) {
                res = Math.max(res, num + allDigitSums.get(digitSum));
            }

            allDigitSums.put(
                    digitSum,
                    Math.max(num, allDigitSums.getOrDefault(digitSum, 0))
            );
        }

        return res;
    }
}
