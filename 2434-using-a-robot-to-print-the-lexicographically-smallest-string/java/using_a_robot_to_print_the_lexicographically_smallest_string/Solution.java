package using_a_robot_to_print_the_lexicographically_smallest_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().robotWithString("zza");
        assert res1.equals("azz");

        String res2 = new Solution().robotWithString("bac");
        assert res2.equals("abc");

        String res3 = new Solution().robotWithString("bdda");
        assert res3.equals("addb");

        String res4 = new Solution().robotWithString("bdda");
        assert res4.equals("addb");

        String res5 = new Solution().robotWithString("bydizfve");
        assert res5.equals("bdevfziy");

        String res6 = new Solution().robotWithString("vzhofnpo");
        assert res6.equals("fnohopzv");
    }

    public String robotWithString(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        Stack<Character> t = new Stack<>();
        StringBuilder p = new StringBuilder();

        int i = 97;
        int j = 0;
        while (i < 123) {
            char currChar = (char) i;
            int count = charCounts.getOrDefault(currChar, 0);
            if (count == 0) {
                i++;
                continue;
            }

            while (!t.isEmpty() && t.peek() <= currChar) {
                p.append(t.pop());
            }

            while (j < s.length() && s.charAt(j) != currChar) {
                t.push(s.charAt(j));
                charCounts.put(s.charAt(j), charCounts.get(s.charAt(j)) - 1);
                j++;
            }

            if (j < s.length()) {
                t.push(s.charAt(j));
                j++;
            }

            count--;
            charCounts.put(currChar, count);
            if (count == 0) {
                i++;
            }
        }

        while (!t.isEmpty()) {
            p.append(t.pop());
        }

        return p.toString();
    }
}
