package valid_palindrome;

public class Solution {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        boolean res1 = new Solution().isPalindrome(str1);
        assert res1 == true;

        String str2 = "race a car";
        boolean res2 = new Solution().isPalindrome(str2);
        assert res2 == false;

        String str3 = " ";
        boolean res3 = new Solution().isPalindrome(str3);
        assert res3 == true;
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char ch1 = chars[i];
            char ch2 = chars[j];

            if (!Character.isLetterOrDigit(ch1)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(ch2)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}