package asteroid_collision;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] asteroids1 = { 5,10,-5 };
        int[] res1 = new Solution().asteroidCollision(asteroids1);
        assert res1[0] == 5;
        assert res1[1] == 10;

        int[] asteroids2 = { 8,-8 };
        int[] res2 = new Solution().asteroidCollision(asteroids2);
        assert res2.length == 0;

        int[] asteroids3 = { 10,2,-5 };
        int[] res3 = new Solution().asteroidCollision(asteroids3);
        assert res3[0] == 10;

        int[] asteroids4 = { -2,-1,1,2 };
        int[] res4 = new Solution().asteroidCollision(asteroids4);
        assert res4[0] == -2;
        assert res4[1] == -1;
        assert res4[2] == 1;
        assert res4[3] == 2;

        int[] asteroids5 = { -2,1,-1,-2 };
        int[] res5 = new Solution().asteroidCollision(asteroids5);
        assert res5[0] == -2;
        assert res5[1] == -2;
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int curr : asteroids) {
            boolean exploded = false;

            while (!stack.isEmpty() && stack.peek() > 0 && curr < 0) {
                int prevMass = Math.abs(stack.peek());
                int currMass = Math.abs(curr);

                if (prevMass <= Math.abs(curr)) {
                    stack.pop();
                }

                if (prevMass >= currMass) {
                    exploded = true;
                    break;
                }
            }

            if (!exploded) {
                stack.push(curr);
            }
        }

        int[] res = new int[stack.size()];
        int i = res.length - 1;
        while (!stack.isEmpty()) {
            res[i] = stack.pop();
            i--;
        }

        return res;
    }
}
