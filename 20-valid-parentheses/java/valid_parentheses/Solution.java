package valid_parentheses;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isValid("()");
        assert res1 == true;

        boolean res2 = new Solution().isValid("()[]{}");
        assert res2 == true;

        boolean res3 = new Solution().isValid("(]");
        assert res3 == false;

        boolean res4 = new Solution().isValid("([{");
        assert res4 == false;
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else if (stack.size() == 0 || stack.pop() != ch) {
                return false;
            }
        }

        return stack.size() == 0;
    }
}
