package merge_sorted_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        new Solution().merge(nums1, 3, nums2, 3);
        assert nums1[0] == 1;
        assert nums1[1] == 2;
        assert nums1[2] == 2;
        assert nums1[3] == 3;
        assert nums1[4] == 5;
        assert nums1[5] == 6;

        int[] nums3 = new int[] { 1 };
        int[] nums4 = new int[0];
        new Solution().merge(nums3, 1, nums4, 0);
        assert nums3[0] == 1;

        int[] nums5 = new int[] { 0 };
        int[] nums6 = new int[] { 1 };
        new Solution().merge(nums5, 0, nums6, 1);
        assert nums5[0] == 1;

        int[] nums7 = new int[] { 2, 0 };
        int[] nums8 = new int[] { 1 };
        new Solution().merge(nums7, 1, nums8, 1);
        assert nums7[0] == 1;
        assert nums7[1] == 2;

        int[] nums9 = new int[] { 4, 5, 6, 0, 0, 0 };
        int[] nums10 = new int[] { 1, 2, 3 };
        new Solution().merge(nums9, 3, nums10, 3);
        assert nums9[0] == 1;
        assert nums9[1] == 2;
        assert nums9[2] == 3;
        assert nums9[3] == 4;
        assert nums9[4] == 5;
        assert nums9[5] == 6;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insPos = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i < 0) {
                nums1[j] = nums2[j];
                j--;
                continue;
            }

            if (nums1[i] >= nums2[j]) {
                nums1[insPos] = nums1[i];
                i--;
            } else {
                nums1[insPos] = nums2[j];
                j--;
            }
            insPos--;
        }
    }
}
