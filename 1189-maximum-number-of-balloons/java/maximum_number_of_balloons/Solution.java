package maximum_number_of_balloons;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().maxNumberOfBalloons("nlaebolko");
        assert res1 == 1;

        int res2 = new Solution().maxNumberOfBalloons("loonbalxballpoon");
        assert res2 == 2;

        int res3 = new Solution().maxNumberOfBalloons("leetcode");
        assert res3 == 0;
    }

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> counts = new HashMap<>();
        counts.put('b', 0);
        counts.put('a', 0);
        counts.put('l', 0);
        counts.put('o', 0);
        counts.put('n', 0);

        for (char ch : text.toCharArray()) {
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                counts.put(ch, counts.get(ch) + 1);
            }
        }

        int res = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (ch == 'l' || ch == 'o') {
                res = Math.min(res, count / 2);
            } else {
                res = Math.min(res, count);
            }
        }

        return res;
    }
}
