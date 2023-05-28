package range_sum_query_immutable;

public class Solution {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] { -2, 0, 3, -5, 2, -1 });
        assert numArray.sumRange(0, 2) == 1;
        assert numArray.sumRange(2, 5) == -1;
        assert numArray.sumRange(0, 5) == -3;
    }
}

class NumArray {

    private final int[] prefixSum;

    public NumArray(int[] nums) {
        this.prefixSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = nums[i] + (i > 0 ? prefixSum[i-1] : 0);
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right] - (left > 0 ? prefixSum[left-1] : 0);
    }
}
