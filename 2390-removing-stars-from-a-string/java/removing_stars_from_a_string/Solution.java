package removing_stars_from_a_string;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().removeStars("leet**cod*e");
        assert res1.equals("lecoe");

        String res2 = new Solution().removeStars("erase*****");
        assert res2.equals("");
    }

    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                res.append(ch);
                continue;
            }
            if (!res.isEmpty()) {
                res.deleteCharAt(res.length() - 1);
            }
        }

        return res.toString();
    }
}
