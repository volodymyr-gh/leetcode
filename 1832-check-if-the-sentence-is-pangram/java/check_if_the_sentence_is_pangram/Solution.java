package check_if_the_sentence_is_pangram;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        assert res1 == true;

        boolean res2 = new Solution().checkIfPangram("leetcode");
        assert res2 == false;
    }

    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            seen.add(ch);
        }

        return seen.size() == 26;
    }
}
