package jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().numJewelsInStones("aA", "aAAbbbb");
        assert res1 == 3;

        int res2 = new Solution().numJewelsInStones("z", "ZZ");
        assert res2 == 0;
    }

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsSet = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            jewelsSet.add(ch);
        }

        int res = 0;
        for (char ch : stones.toCharArray()) {
            if (jewelsSet.contains(ch)) {
                res++;
            }
        }

        return res;
    }
}
