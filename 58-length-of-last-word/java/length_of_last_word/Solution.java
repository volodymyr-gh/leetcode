package length_of_last_word;

public class Solution {
    public static void main(String[] args) {
        String str1 = "Hello World";
        int res1 = new Solution().lengthOfLastWord(str1);
        assert res1 == 5;

        String str2 = "   fly me   to   the moon  ";
        int res2 = new Solution().lengthOfLastWord(str2);
        assert res2 == 4;

        String str3 = "luffy is still joyboy";
        int res3 = new Solution().lengthOfLastWord(str3);
        assert res3 == 6;
    }

    public int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!Character.isWhitespace(s.charAt(i))) {
                result++;
            } else if (result > 0) {
                break;
            }
        }

        return result;
    }
}
