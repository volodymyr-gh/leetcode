package reverse_integer;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().reverse(123);
        assert res1 == 321;

        int res2 = new Solution().reverse(-123);
        assert res2 == -321;

        int res3 = new Solution().reverse(120);
        assert res3 == 21;

        int res4 = new Solution().reverse(1534236469);
        assert res4 == 0;

        int res5 = new Solution().reverse(1463847412);
        assert res5 == 2147483641;
    }

    public int reverse(int x) {
        int absX = Math.abs(x);
        int res = 0;

        while (absX > 0) {
            int remainder = absX % 10;
            absX = (absX - remainder) / 10;

            if (((Integer.MAX_VALUE - remainder) / 10) < res) {
                return 0;
            }

            res = res * 10 + remainder;
        }

        return x < 0 ? res * -1 : res;
    }
}
