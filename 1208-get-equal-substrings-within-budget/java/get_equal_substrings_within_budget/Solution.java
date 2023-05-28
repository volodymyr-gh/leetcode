package get_equal_substrings_within_budget;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().equalSubstring("abcd", "bcdf", 3);
        assert res1 == 3;

        int res2 = new Solution().equalSubstring("abcd", "cdef", 3);
        assert res2 == 1;

        int res3 = new Solution().equalSubstring("abcd", "acde", 0);
        assert res3 == 1;
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int res = 0;
        int currCost = 0;
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            currCost += Math.abs(s.charAt(i) - t.charAt(i));
            while (currCost > maxCost) {
                currCost -= Math.abs(s.charAt(j) - t.charAt(j));
                j++;
            }
            res = Math.max(res, i - j + 1);
            i++;
        }

        return res;
    }
}
