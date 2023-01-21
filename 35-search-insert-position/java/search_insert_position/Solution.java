package search_insert_position;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 3, 5, 6 };
        int target1 = 5;
        int res1 = new Solution().searchInsert(nums1, target1);
        assert res1 == 2;

        int[] nums2 = new int[] { 1, 3, 5, 6 };
        int target2 = 2;
        int res2 = new Solution().searchInsert(nums2, target2);
        assert res2 == 1;

        int[] nums3 = new int[] { 1, 3, 5, 6 };
        int target3 = 7;
        int res3 = new Solution().searchInsert(nums3, target3);
        assert res3 == 4;

        int[] nums4 = new int[] { 1, 3, 5, 6 };
        int target4 = 0;
        int res4 = new Solution().searchInsert(nums4, target4);
        assert res4 == 0;
    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            int midVal = nums[mid];

            if (midVal == target) {
                return mid;
            }

            if (midVal > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}
