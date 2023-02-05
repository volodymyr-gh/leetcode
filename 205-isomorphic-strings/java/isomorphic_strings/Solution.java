package isomorphic_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isIsomorphic("egg", "add");
        assert res1 == true;

        boolean res2 = new Solution().isIsomorphic("foo", "bar");
        assert res2 == false;

        boolean res3 = new Solution().isIsomorphic("paper", "title");
        assert res3 == true;

        boolean res4 = new Solution().isIsomorphic("badc", "baba");
        assert res4 == false;
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMapping = new HashMap<>();
        Set<Character> tChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (!charMapping.containsKey(ch1)) {
                if (tChars.contains(ch2)) {
                    return false;
                }

                charMapping.put(ch1, ch2);
                tChars.add(ch2);
                continue;
            }

            if (charMapping.get(ch1) != ch2) {
                return false;
            }
        }

        return true;
    }
}
