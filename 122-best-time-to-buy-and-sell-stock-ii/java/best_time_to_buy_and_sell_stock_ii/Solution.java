package best_time_to_buy_and_sell_stock_ii;

public class Solution {
    public static void main(String[] args) {
        int[] prices1 = new int[] { 7, 1, 5, 3, 6, 4 };
        int res1 = new Solution().maxProfit(prices1);
        assert res1 == 7;

        int[] prices2 = new int[] { 1, 2, 3, 4, 5 };
        int res2 = new Solution().maxProfit(prices2);
        assert res2 == 4;

        int[] prices3 = new int[] { 7, 6, 4, 3, 1 };
        int res3 = new Solution().maxProfit(prices3);
        assert res3 == 0;

    }

    public int maxProfit(int[] prices) {
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i-1];
            if (profit > 0) {
                result += profit;
            }
        }

        return result;
    }
}