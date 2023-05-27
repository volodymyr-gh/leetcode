package reverse_prefix_of_word;

public class Solution {
    public static void main(String[] args) {
        String res = new Solution().reversePrefix("abcdefd", 'd');
        assert res.equals("dcbaefd");
    }

    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();

        int chIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                chIndex = i;
                break;
            }
        }

        int i = 0;
        while (i < chIndex) {
            char temp = chars[i];
            chars[i] = chars[chIndex];
            chars[chIndex] = temp;
            i++;
            chIndex--;
        }

        return new String(chars);
    }
}
