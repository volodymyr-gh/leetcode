package first_unique_character_in_string;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String str1 = "leetcode";
        int res1 = new Solution().firstUniqChar(str1);
        assert res1 == 0;

        String str2 = "loveleetcode";
        int res2 = new Solution().firstUniqChar(str2);
        assert res2 == 2;

        String str3 = "aabb";
        int res3 = new Solution().firstUniqChar(str3);
        assert res3 == -1;
    }

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        Map<Character, Integer> occurrences = new HashMap<>();
        for (char ch : chars) {
            int charOccurrences = occurrences.getOrDefault(ch, 0);
            occurrences.put(ch, charOccurrences + 1);
        }

        for (int i = 0; i < chars.length; i++) {
            if (occurrences.get(chars[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}