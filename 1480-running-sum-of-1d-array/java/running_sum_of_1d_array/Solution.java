package running_sum_of_1d_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] res = new Solution().runningSum(nums);
        assert res[0] == 1;
        assert res[1] == 3;
        assert res[2] == 6;
        assert res[3] == 10;
    }

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i-1];
        }

        return res;
    }
}
