package word_pattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().wordPattern("abba", "dog cat cat dog");
        assert res1 == true;

        boolean res2 = new Solution().wordPattern("abba", "dog cat cat fish");
        assert res2 == false;

        boolean res3 = new Solution().wordPattern("aaaa", "dog cat cat dog");
        assert res3 == false;

        boolean res4 = new Solution().wordPattern("abba", "dog dog dog dog");
        assert res4 == false;
    }

    public boolean wordPattern(String pattern, String s) {
        char[] patternChars = pattern.toCharArray();
        String[] words = s.split(" ");

        if (patternChars.length != words.length) {
            return false;
        }

        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < patternChars.length; i++) {
            char ch = patternChars[i];
            String word = words[i];

            if (charMap.containsKey(ch) && !charMap.get(ch).equals(word)) {
                return false;
            }

            if (wordMap.containsKey(word) && !wordMap.get(word).equals(ch)) {
                return false;
            }

            charMap.put(ch, word);
            wordMap.put(word, ch);
        }

        return true;
    }
}
