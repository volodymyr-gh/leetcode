package subarray_product_less_than_k;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 };
        int res = new Solution().numSubarrayProductLessThanK(nums, 100);
        assert res == 8;
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int currProduct = 1;
        int res = 0;

        while (j < nums.length) {
            currProduct *= nums[j];

            while (currProduct >= k) {
                currProduct /= nums[i];
                i++;
            }

            res += j - i + 1;
            j++;
        }

        return res;
    }
}
