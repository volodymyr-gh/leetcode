package check_if_all_characters_have_equal_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().areOccurrencesEqual("abacbc");
        assert res1 == true;

        boolean res2 = new Solution().areOccurrencesEqual("aaabb");
        assert res2 == false;
    }

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>(counts.values());
        return frequencies.size() == 1;
    }
}
