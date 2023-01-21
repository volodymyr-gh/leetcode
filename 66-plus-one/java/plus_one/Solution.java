package plus_one;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3 };
        int[] res1 = new Solution().plusOne(arr1);
        assert res1.length == 3;
        assert res1[0] == 1;
        assert res1[1] == 2;
        assert res1[2] == 4;

        int[] arr2 = new int[] { 9, 9, 9 };
        int[] res2 = new Solution().plusOne(arr2);
        assert res2.length == 4;
        assert res2[0] == 1;
        assert res2[1] == 0;
        assert res2[2] == 0;
        assert res2[3] == 0;
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }
}