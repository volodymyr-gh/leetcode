package longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit;

import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 8,2,4,7 };
        int res1 = new Solution().longestSubarray(nums1, 4);
        assert res1 == 2;

        int[] nums2 = { 10,1,2,4,7,2 };
        int res2 = new Solution().longestSubarray(nums2, 5);
        assert res2 == 4;
    }

    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> inc = new ArrayDeque<>();
        ArrayDeque<Integer> dec = new ArrayDeque<>();

        int res = 0;
        int right = 0;
        int left = 0;

        while (right < nums.length) {
            while (!inc.isEmpty() && inc.getLast() > nums[right]) {
                inc.removeLast();
            }
            inc.addLast(nums[right]);

            while (!dec.isEmpty() && dec.getLast() < nums[right]) {
                dec.removeLast();
            }
            dec.addLast(nums[right]);

            while (dec.getFirst() - inc.getFirst() > limit) {
                if (nums[left] == inc.getFirst()) {
                    inc.removeFirst();
                }
                if (nums[left] == dec.getFirst()) {
                    dec.removeFirst();
                }
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }

        return res;
    }
}
