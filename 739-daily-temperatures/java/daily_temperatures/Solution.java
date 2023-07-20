package daily_temperatures;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        int[] temps1 = { 73,74,75,71,69,72,76,73 };
        int[] res1 = new Solution().dailyTemperatures(temps1);
        assert res1[0] == 1;
        assert res1[1] == 1;
        assert res1[2] == 4;
        assert res1[3] == 2;
        assert res1[4] == 1;
        assert res1[5] == 1;
        assert res1[6] == 0;
        assert res1[7] == 0;

        int[] temps2 = { 30,40,50,60 };
        int[] res2 = new Solution().dailyTemperatures(temps2);
        assert res2[0] == 1;
        assert res2[1] == 1;
        assert res2[2] == 1;
        assert res2[3] == 0;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] < temp) {
                int j = stack.pop();
                res[j] = i - j;
            }

            stack.push(i);
        }

        return res;
    }
}
