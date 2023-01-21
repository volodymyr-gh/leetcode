package best_time_to_buy_and_sell_stock;

public class Solution {
    public static void main(String[] args) {
        int[] prices1 = new int[] { 7, 1, 5, 3, 6, 4 };
        int res1 = new Solution().maxProfit(prices1);
        assert res1 == 5;

        int[] prices2 = new int[] { 7, 6, 4, 3, 1 };
        int res2 = new Solution().maxProfit(prices2);
        assert res2 == 0;
    }

    public int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
                continue;
            }

            int profit = price - lowestPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
