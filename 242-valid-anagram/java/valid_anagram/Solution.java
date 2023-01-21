package valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean res1 = new Solution().isAnagram(s1, t1);
        assert res1 == true;

        String s2 = "rat";
        String t2 = "car";
        boolean res2 = new Solution().isAnagram(s2, t2);
        assert res2 == false;

        String s3 = "ab";
        String t3 = "a";
        boolean res3 = new Solution().isAnagram(s3, t3);
        assert res3 == false;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            int charCount = counts.getOrDefault(ch, -1);
            if (charCount < 1) {
                return false;
            }
            counts.put(ch, charCount - 1);
        }

        return true;
    }
}
