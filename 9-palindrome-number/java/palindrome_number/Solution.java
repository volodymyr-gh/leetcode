package palindrome_number;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isPalindrome(121);
        assert res1 == true;

        boolean res2 = new Solution().isPalindrome(-121);
        assert res2 == false;

        boolean res3 = new Solution().isPalindrome(10);
        assert res3 == false;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int temp = x;
        while (temp > 0) {
            int remainder = temp % 10;
            temp /= 10;
            reversed = reversed * 10 + remainder;
        }

        return x == reversed;
    }
}
