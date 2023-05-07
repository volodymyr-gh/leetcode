package squares_of_sorted_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { -4, -1, 0, 3, 10 };
        int[] res1 = new Solution().sortedSquares(nums1);
        assert res1[0] == 0;
        assert res1[1] == 1;
        assert res1[2] == 9;
        assert res1[3] == 16;
        assert res1[4] == 100;

        int[] nums2 = new int[] { -7, -3, 2, 3, 11 };
        int[] res2 = new Solution().sortedSquares(nums2);
        assert res2[0] == 4;
        assert res2[1] == 9;
        assert res2[2] == 9;
        assert res2[3] == 49;
        assert res2[4] == 121;
    }

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;

        int i = 0;
        int j = len - 1;

        int[] res = new int[len];
        int k = len - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return res;
    }
}
