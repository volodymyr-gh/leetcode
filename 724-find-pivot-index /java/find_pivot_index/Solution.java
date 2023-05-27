package find_pivot_index;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1, 7, 3, 6, 5, 6 };
        int res1 = new Solution().pivotIndex(nums1);
        assert res1 == 3;

        int[] nums2 = { 1, 2, 3 };
        int res2 = new Solution().pivotIndex(nums2);
        assert res2 == -1;

        int[] nums3 = { 2, 1, -1 };
        int res3 = new Solution().pivotIndex(nums3);
        assert res3 == 0;
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
