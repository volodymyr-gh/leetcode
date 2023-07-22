package validate_stack_sequences;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] pushed1 = { 1,2,3,4,5 };
        int[] popped1 = { 4,5,3,2,1 };
        boolean res1 = new Solution().validateStackSequences(pushed1, popped1);
        assert res1 == true;

        int[] pushed2 = { 1,2,3,4,5 };
        int[] popped2 = { 4,3,5,1,2 };
        boolean res2 = new Solution().validateStackSequences(pushed2, popped2);
        assert res2 == false;

        int[] pushed3 = { 2,1,0 };
        int[] popped3 = { 1,2,0 };
        boolean res3 = new Solution().validateStackSequences(pushed3, popped3);
        assert res3 == true;

        int[] pushed4 = { 1,2,3,4,5,6,7 };
        int[] popped4 = { 1,2,5,3,6,7,4 };
        boolean res4 = new Solution().validateStackSequences(pushed4, popped4);
        assert res4 == false;
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int j = 0;
        for (; i < pushed.length; i++) {
            stack.push(pushed[i]);

            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}
