package missing_number;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 3, 0, 1 };
        int res1 = new Solution().missingNumber(nums1);
        assert res1 == 2;

        int[] nums2 = new int[] { 0, 1 };
        int res2 = new Solution().missingNumber(nums2);
        assert res2 == 2;

        int[] nums3 = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int res3 = new Solution().missingNumber(nums3);
        assert res3 == 8;
    }

    public int missingNumber(int[] nums) {
        int expectedSum = 0;
        for (int i = 1; i <= nums.length; i++) {
            expectedSum += i;
        }

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
