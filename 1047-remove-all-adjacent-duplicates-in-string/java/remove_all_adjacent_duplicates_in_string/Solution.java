package remove_all_adjacent_duplicates_in_string;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().removeDuplicates("abbaca");
        assert res1.equals("ca");

        String res2 = new Solution().removeDuplicates("azxxzy");
        assert res2.equals("ay");
    }

    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == ch) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}
