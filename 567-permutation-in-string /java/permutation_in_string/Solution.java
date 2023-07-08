package permutation_in_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().checkInclusion("ab", "eidbaooo");
        assert res1 == true;

        boolean res2 = new Solution().checkInclusion("ab", "eidboaoo");
        assert res2 == false;

        boolean res3 = new Solution().checkInclusion("abb", "eidbabaooo");
        assert res3 == true;

        boolean res4 = new Solution().checkInclusion("adc", "dcda");
        assert res4 == true;

        boolean res5 = new Solution().checkInclusion("hello", "ooolleoooleh");
        assert res5 == false;
    }

    public boolean checkInclusion(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        int s1Len = s1Chars.length;

        if (s2Chars.length < s1Len) {
            return false;
        }

        Map<Character, Integer> s1Counts = new HashMap<>();
        Map<Character, Integer> s2Counts = new HashMap<>();
        for (int i = 0; i < s1Len; i++) {
            s1Counts.put(s1Chars[i], s1Counts.getOrDefault(s1Chars[i], 0) + 1);
            s2Counts.put(s2Chars[i], s2Counts.getOrDefault(s2Chars[i], 0) + 1);
        }

        for (int i = s1Len; i < s2Chars.length; i++) {
            if (areEqual(s1Counts, s2Counts)) {
                return true;
            }
            s2Counts.put(s2Chars[i], s2Counts.getOrDefault(s2Chars[i], 0) + 1);
            s2Counts.put(s2Chars[i - s1Len], s2Counts.get(s2Chars[i - s1Len]) - 1);
        }

        return areEqual(s1Counts, s2Counts);
    }

    private boolean areEqual(Map<Character, Integer> m1, Map<Character, Integer> m2) {
        boolean result = true;
        for (char key : m1.keySet()) {
            if (!Objects.equals(m1.get(key), m2.getOrDefault(key, 0))) {
                result = false;
            }
        }

        return result;
    }
}
