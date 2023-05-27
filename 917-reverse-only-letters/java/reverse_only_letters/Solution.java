package reverse_only_letters;

public class Solution {
    public static void main(String[] args) {
        String res = new Solution().reverseOnlyLetters("a-bC-dEf-ghIj");
        assert res.equals("j-Ih-gfE-dCba");
    }

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetter(chars[i])) {
                i++;
                continue;
            }
            if (!Character.isLetter(chars[j])) {
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);
    }
}
