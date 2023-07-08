package isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

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
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length != tArr.length) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < tArr.length; i++) {
            char sChar = sArr[i];
            char tChar = tArr[i];

            if (sToT.containsKey(sChar) && sToT.get(sChar) != tChar) {
                return false;
            }

            if (tToS.containsKey(tChar) && tToS.get(tChar) != sChar) {
                return false;
            }

            sToT.put(sChar, tChar);
            tToS.put(tChar, sChar);
        }

        return true;
    }
}
