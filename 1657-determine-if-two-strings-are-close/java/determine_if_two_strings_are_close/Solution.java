package determine_if_two_strings_are_close;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().closeStrings("abc", "bca");
        assert res1 == true;

        boolean res2 = new Solution().closeStrings("a", "aa");
        assert res2 == false;

        boolean res3 = new Solution().closeStrings("cabbba", "abbccc");
        assert res3 == true;

        boolean res4 = new Solution().closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff");
        assert res4 == false;
    }

    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> w1Chars = new HashMap<>();
        for (char ch : word1.toCharArray()) {
            w1Chars.put(ch, w1Chars.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, Integer> w1Counts = new HashMap<>();
        for (int count : w1Chars.values()) {
            w1Counts.put(count, w1Counts.getOrDefault(count, 0) + 1);
        }

        Map<Character, Integer> w2Chars = new HashMap<>();
        for (char ch : word2.toCharArray()) {
            w2Chars.put(ch, w2Chars.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, Integer> w2Counts = new HashMap<>();
        for (int count : w2Chars.values()) {
            w2Counts.put(count, w2Counts.getOrDefault(count, 0) + 1);
        }

        if (w1Chars.size() != w2Chars.size()) {
            return false;
        }

        if (w1Counts.size() != w2Counts.size()) {
            return false;
        }

        for (char ch : w2Chars.keySet()) {
            if (!w1Chars.containsKey(ch)) {
                return false;
            }
        }

        for (int count : w2Counts.keySet()) {
            if (!w1Counts.containsKey(count) || !Objects.equals(w1Counts.get(count), w2Counts.get(count))) {
                return false;
            }
        }

        return true;
    }
}
