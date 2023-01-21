package longest_common_prefix;

public class Solution {
    public static void main(String[] args) {
        String[] strs1 = new String[] { "flower", "flow", "flight" };
        String res1 = new Solution().longestCommonPrefix(strs1);
        assert res1.equals("fl");

        String[] strs2 = new String[] { "dog", "racecar", "car" };
        String res2 = new Solution().longestCommonPrefix(strs2);
        assert res2.equals("");
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        String firstStr = strs[0];
        int firstStrLen = firstStr.length();

        for (int i = 0; i < firstStrLen; i++) {
            char ch = firstStr.charAt(i);

            int j = 1;
            while (j < strs.length) {
                String currStr = strs[j];
                int currStrLen = currStr.length();
                if ((i > currStrLen - 1) || (currStr.charAt(i) != ch)) {
                    break;
                }
                j++;
            }

            if (j == strs.length) {
                result.append(ch);
            } else {
                break;
            }
        }

        return result.toString();
    }
}