package maximum_average_subarray_i;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        double res = new Solution().findMaxAverage(nums, 4);
        assert res == 12.75;
    }

    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;

        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }

        double maxAvg = currSum / k;
        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, currSum / k);
        }

        return maxAvg;
    }
}
