package majority_element;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 3, 2, 3 };
        int res1 = new Solution().majorityElement(nums1);
        assert res1 == 3;

        int[] nums2 = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        int res2 = new Solution().majorityElement(nums2);
        assert res2 == 2;
    }

    public Integer majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
