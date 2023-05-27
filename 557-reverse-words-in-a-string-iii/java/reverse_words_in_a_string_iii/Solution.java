package reverse_words_in_a_string_iii;

public class Solution {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String res = new Solution().reverseWords(s);
        assert res.equals("s'teL ekat edoCteeL tsetnoc");
    }

    public String reverseWords(String s) {
        int len = s.length();
        int lastSpaceIndex = -1;
        char[] chars = s.toCharArray();

        for (int i = 0; i <= len; i++) {
            if (i == len || s.charAt(i) == ' ') {
                int wordStartIndex = lastSpaceIndex + 1;
                int wordEndIndex = i - 1;
                while (wordStartIndex < wordEndIndex) {
                    char temp = chars[wordStartIndex];
                    chars[wordStartIndex] = chars[wordEndIndex];
                    chars[wordEndIndex] = temp;
                    wordStartIndex++;
                    wordEndIndex--;
                }
                lastSpaceIndex = i;
            }
        }

        return new String(chars);
    }
}
