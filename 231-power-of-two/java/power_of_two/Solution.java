package power_of_two;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isPowerOfTwo(1);
        assert res1 == true;

        boolean res2 = new Solution().isPowerOfTwo(16);
        assert res2 == true;

        boolean res3 = new Solution().isPowerOfTwo(3);
        assert res3 == false;

        boolean res4 = new Solution().isPowerOfTwo(0);
        assert res4 == false;
    }

    public boolean isPowerOfTwo(int n) {
        while (n > 1) {
            int rem = n % 2;
            if (rem > 0) return false;
            n /= 2;
        }

        return n == 1;
    }
}
