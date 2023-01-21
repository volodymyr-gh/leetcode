package single_number;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 2, 2, 1 };
        int res1 = new Solution().singleNumber(arr1);
        assert res1 == 1;

        int[] arr2 = new int[] { 4, 1, 2, 1, 2 };
        int res2 = new Solution().singleNumber(arr2);
        assert res2 == 4;

        int[] arr3 = new int[] { 1 };
        int res3 = new Solution().singleNumber(arr3);
        assert res3 == 1;
    }

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}