package counting_elements;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1,1,1,1,2,3 };
        int res1 = new Solution().countElements(nums1);
        assert res1 == 5;

        int[] nums2 = { 1,1,3,3,5,5,7,7 };
        int res2 = new Solution().countElements(nums2);
        assert res2 == 0;
    }

    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        int res = 0;
        for (int n : arr) {
            if (set.contains(n + 1)) {
                res++;
            }
        }

        return res;
    }
}
