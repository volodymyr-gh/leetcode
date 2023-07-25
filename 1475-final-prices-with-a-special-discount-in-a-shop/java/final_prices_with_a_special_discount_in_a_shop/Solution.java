package final_prices_with_a_special_discount_in_a_shop;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] prices1 = { 8,4,6,2,3 };
        int[] res1 = new Solution().finalPrices(prices1);
        assert res1[0] == 4;
        assert res1[1] == 2;
        assert res1[2] == 4;
        assert res1[3] == 2;
        assert res1[4] == 3;

        int[] prices2 = { 1,2,3,4,5 };
        int[] res2 = new Solution().finalPrices(prices2);
        assert res2[0] == 1;
        assert res2[1] == 2;
        assert res2[2] == 3;
        assert res2[3] == 4;
        assert res2[4] == 5;

        int[] prices3 = { 10,1,1,6 };
        int[] res3 = new Solution().finalPrices(prices3);
        assert res3[0] == 9;
        assert res3[1] == 0;
        assert res3[2] == 1;
        assert res3[3] == 6;
    }

    public int[] finalPrices(int[] prices) {
        Stack<Integer> inc = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!inc.isEmpty() && prices[i] <= prices[inc.peek()]) {
                int j = inc.pop();
                prices[j] -= prices[i];
            }
            inc.push(i);
        }

        return prices;
    }
}
