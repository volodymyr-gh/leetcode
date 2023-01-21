package power_of_three;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isPowerOfThree(27);
        assert res1 == true;

        boolean res2 = new Solution().isPowerOfThree(72);
        assert res2 == false;

        boolean res3 = new Solution().isPowerOfThree(0);
        assert res3 == false;

        boolean res4 = new Solution().isPowerOfThree(-1);
        assert res4 == false;

        boolean res5 = new Solution().isPowerOfThree(1);
        assert res5 == true;

        boolean res6 = new Solution().isPowerOfThree(2147483647);
        assert res6 == false;
    }

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        int curr = n;
        while (curr % 3 == 0) {
            curr /= 3;
        }

        return curr == 1;
    }
}
