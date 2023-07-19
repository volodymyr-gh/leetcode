package backspace_string_compare;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().backspaceCompare("ab#c", "ad#c");
        assert res1 == true;

        boolean res2 = new Solution().backspaceCompare("ab##", "c#d#");
        assert res2 == true;

        boolean res3 = new Solution().backspaceCompare("a#c", "b");
        assert res3 == false;

        boolean res4 = new Solution().backspaceCompare("y#fo##f", "y#f#o##f");
        assert res4 == true;
    }

    public boolean backspaceCompare(String s, String t) {
        return applyBackspace(s).equals(applyBackspace(t));
    }

    private String applyBackspace(String s) {
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int len = res.length();
            if (ch != '#') {
                res.append(ch);
            } else if (len > 0) {
                res.deleteCharAt(len - 1);
            }
        }

        return res.toString();
    }
}
