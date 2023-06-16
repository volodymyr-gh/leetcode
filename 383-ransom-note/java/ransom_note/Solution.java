package ransom_note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().canConstruct("a", "b");
        assert res1 == false;

        boolean res2 = new Solution().canConstruct("aa", "ab");
        assert res2 == false;

        boolean res3 = new Solution().canConstruct("aa", "aab");
        assert res3 == true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> chars = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!chars.containsKey(ch) || chars.get(ch) < 1) {
                return false;
            }
            chars.put(ch, chars.get(ch) - 1);
        }

        return true;
    }
}
