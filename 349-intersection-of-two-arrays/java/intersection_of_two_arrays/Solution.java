package intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 2, 1 };
        int[] arr2 = new int[] { 2, 2 };
        int[] res1 = new Solution().intersection(arr1, arr2);
        assert res1.length == 1;
        assert res1[0] == 2;

        int[] arr3 = new int[] { 4, 9, 5 };
        int[] arr4 = new int[] { 9, 4, 9, 8, 4 };
        int[] res2 = new Solution().intersection(arr3, arr4);
        assert res2.length == 2;
        assert res2[0] == 4 || res2[0] == 9;
        assert res2[1] == 4 || res2[1] == 9;

        int[] arr5 = new int[] { 4, 7, 9, 7, 6, 7 };
        int[] arr6 = new int[] { 5, 0, 0, 6, 1, 6, 2, 2, 4 };
        int[] res3 = new Solution().intersection(arr5, arr6);
        assert res3.length == 2;
        assert res3[0] == 4 || res3[0] == 6;
        assert res3[1] == 4 || res3[1] == 6;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);

        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);

        Set<Integer> big;
        Set<Integer> small;
        if (set1.size() >= set2.size()) {
            big = set1;
            small = set2;
        } else {
            big = set2;
            small = set1;
        }

        int[] tempResult = new int[small.size()];
        int i = 0;
        for (int n : small) {
            if (big.contains(n)) tempResult[i++] = n;
        }

        int[] result = new int[i];
        System.arraycopy(tempResult, 0, result, 0, i);

        return result;
    }
}