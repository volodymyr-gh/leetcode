package sliding_window_maximum;

import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1,3,-1,-3,5,3,6,7 };
        int[] res1 = new Solution().maxSlidingWindow(nums1, 3);
        assert res1[0] == 3;
        assert res1[1] == 3;
        assert res1[2] == 5;
        assert res1[3] == 5;
        assert res1[4] == 6;
        assert res1[5] == 7;

        int[] nums2 = { 1 };
        int[] res2 = new Solution().maxSlidingWindow(nums2, 1);
        assert res2[0] == 1;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && nums[q.getLast()] < nums[i]) {
                q.removeLast();
            }

            q.addLast(i);

            if (q.getFirst() + k == i) {
                q.removeFirst();
            }

            if (i >= k - 1) {
                res[i-k+1] = nums[q.getFirst()];
            }
        }

        return res;
    }
}
