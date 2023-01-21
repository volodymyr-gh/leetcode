package intersection_of_two_arrays_ii;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 2, 1 };
        int[] arr2 = new int[] { 2, 2 };
        int[] res1 = new Solution().intersection(arr1, arr2);
        assert res1.length == 2;
        assert res1[0] == 2;
        assert res1[1] == 2;

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
        int[] big;
        int[] small;
        if (nums1.length >= nums2.length) {
            big = nums1;
            small = nums2;
        } else {
            big = nums2;
            small = nums1;
        }

        Arrays.sort(big);
        Arrays.sort(small);

        int[] tempRes = new int[small.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < small.length && j < big.length) {
            if (small[i] == big[j]) {
                tempRes[k] = small[i];
                k++;
                i++;
                j++;
            } else if (small[i] < big[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[k];
        System.arraycopy(tempRes, 0, res, 0, k);

        return res;
    }
}