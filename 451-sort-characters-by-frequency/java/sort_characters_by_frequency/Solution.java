package sort_characters_by_frequency;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().frequencySort("tree");
        assert res1.equals("eert") || res1.equals("eetr");

        String res2 = new Solution().frequencySort("cccaaa");
        assert res2.equals("cccaaa") || res2.equals("aaaccc");

        String res3 = new Solution().frequencySort("Aabb");
        assert res3.equals("bbAa") || res3.equals("bbaA");
    }

    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : chars) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entries = freq.entrySet();
        List<Map.Entry<Character, Integer>> sortedEntries = entries.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .toList();

        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            int charFreq = entry.getValue();
            while (charFreq-- > 0) {
                res.append(entry.getKey());
            }
        }

        return res.toString();
    }
}
