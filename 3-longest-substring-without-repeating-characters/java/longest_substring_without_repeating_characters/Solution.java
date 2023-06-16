package longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().lengthOfLongestSubstring("abcabcbb");
        assert res1 == 3;

        int res2 = new Solution().lengthOfLongestSubstring("bbbbb");
        assert res2 == 1;

        int res3 = new Solution().lengthOfLongestSubstring("pwwkew");
        assert res3 == 3;

        int res4 = new Solution().lengthOfLongestSubstring("abcdefg");
        assert res4 == 7;

        int res5 = new Solution().lengthOfLongestSubstring("abba");
        assert res5 == 2;
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        char[] chars = s.toCharArray();
        int res = 0;
        int left = 0;
        int right = 0;

        while (right < chars.length) {
            char rightChar = chars[right];
            seen.put(rightChar, seen.getOrDefault(rightChar, 0) + 1);

            while (seen.get(rightChar) > 1) {
                char leftChar = chars[left];
                seen.put(leftChar, seen.get(leftChar) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
