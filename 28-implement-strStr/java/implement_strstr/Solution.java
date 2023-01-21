package implement_strstr;

public class Solution {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int res1 = new Solution().strStr(haystack1, needle1);
        assert res1 == 0;

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int res2 = new Solution().strStr(haystack2, needle2);
        assert res2 == -1;

        String haystack3 = "aaa";
        String needle3 = "aaaa";
        int res3 = new Solution().strStr(haystack3, needle3);
        assert res3 == -1;

        String haystack4 = "mississippi";
        String needle4 = "issipi";
        int res4 = new Solution().strStr(haystack4, needle4);
        assert res4 == -1;

        String haystack5 = "a";
        String needle5 = "a";
        int res5 = new Solution().strStr(haystack5, needle5);
        assert res5 == 0;
    }

    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        if (h.length < n.length) {
            return -1;
        }

        int i = 0;
        int j = 0;

        while (i < h.length) {
            if (i + j > h.length - 1) {
                break;
            }

            if (h[i+j] == n[j]) {
                j++;
            } else {
                i++;
                j = 0;
            }

            if (j == n.length) {
                return i;
            }
        }

        return -1;
    }
}