package move_zeroes;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 0, 1, 0, 3, 12 };
        new Solution().moveZeroes(arr1);
        assert arr1[0] == 1;
        assert arr1[1] == 3;
        assert arr1[2] == 12;
        assert arr1[3] == 0;
        assert arr1[4] == 0;

        int[] arr2 = new int[] { 0 };
        new Solution().moveZeroes(arr2);
        assert arr2[0] == 0;

        int[] arr3 = new int[] { 1 };
        new Solution().moveZeroes(arr3);
        assert arr3[0] == 1;
    }

    public void moveZeroes(int[] nums) {
        int numOfZeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numOfZeroes++;
                continue;
            }

            if (numOfZeroes > 0)  {
                nums[i - numOfZeroes] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
