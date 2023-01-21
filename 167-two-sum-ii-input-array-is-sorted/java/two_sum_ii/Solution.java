package two_sum_ii;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 2, 7, 11, 15 };
        int[] res1 = new Solution().twoSum(nums1, 9);
        assert res1.length == 2;
        assert res1[0] == 1;
        assert res1[1] == 2;

        int[] nums2 = new int[] { 2, 3, 4 };
        int[] res2 = new Solution().twoSum(nums2, 6);
        assert res2.length == 2;
        assert res2[0] == 1;
        assert res2[1] == 3;

        int[] nums3 = new int[] { -1, 0 };
        int[] res3 = new Solution().twoSum(nums3, -1);
        assert res3.length == 2;
        assert res3[0] == 1;
        assert res3[1] == 2;

        int[] nums4 = new int[] { 5, 25, 75 };
        int[] res4 = new Solution().twoSum(nums4, 100);
        assert res4.length == 2;
        assert res4[0] == 2;
        assert res4[1] == 3;
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            }

            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[2];
    }
}
