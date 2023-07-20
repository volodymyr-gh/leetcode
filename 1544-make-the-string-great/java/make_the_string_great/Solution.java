package make_the_string_great;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().makeGood("leEeetcode");
        assert res1.equals("leetcode");

        String res2 = new Solution().makeGood("abBAcC");
        assert res2.equals("");

        String res3 = new Solution().makeGood("s");
        assert res3.equals("s");
    }

    public String makeGood(String s) {
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int len = res.length();
            if (!res.isEmpty() && Math.abs(res.charAt(len - 1) - ch) == 32) {
                res.deleteCharAt(len - 1);
            } else {
                res.append(ch);
            }
        }

        return res.toString();
    }
}
