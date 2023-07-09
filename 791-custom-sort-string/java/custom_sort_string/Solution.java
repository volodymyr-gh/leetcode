package custom_sort_string;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().customSortString("cba", "abcd");
        assert res1.equals("cbad");

        String res2 = new Solution().customSortString("cbafg", "abcd");
        assert res2.equals("cbad");

        String res3 = new Solution().customSortString("kqep", "pekeq");
        assert res3.equals("kqeep");
    }

    public String customSortString(String order, String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        StringBuilder res = new StringBuilder();

        for (char ch : order.toCharArray()) {
            if (!counts.containsKey(ch)) {
                continue;
            }
            for (int i = 0; i < counts.get(ch); i++) {
                res.append(ch);
            }
            counts.remove(ch);
        }

        for (char ch : counts.keySet()) {
            for (int i = 0; i < counts.get(ch); i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}
