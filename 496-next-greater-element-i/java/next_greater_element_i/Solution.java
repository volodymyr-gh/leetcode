package next_greater_element_i;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums11 = { 4, 1, 2 };
        int[] nums12 = { 1, 3, 4, 2 };
        int[] res1 = new Solution().nextGreaterElement(nums11, nums12);
        assert res1[0] == -1;
        assert res1[1] == 3;
        assert res1[2] == -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> greater = new HashMap<>(); // index -> index of next greater
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                greater.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = greater.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}
